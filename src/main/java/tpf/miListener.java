package tpf;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;

import tpf.tpfParser.A_listaContext;
import tpf.tpfParser.ArgumentoContext;
import tpf.tpfParser.ArgumentosContext;
import tpf.tpfParser.AsignacionContext;
import tpf.tpfParser.BloqueContext;
import tpf.tpfParser.D_listaContext;
import tpf.tpfParser.Dec_funcContext;
import tpf.tpfParser.Def_funcContext;
import tpf.tpfParser.IeofContext;
import tpf.tpfParser.Llam_funcContext;
import tpf.tpfParser.OpalContext;
import tpf.tpfParser.OparContext;
import tpf.tpfParser.OperacionContext;
import tpf.tpfParser.OvalorContext;
import tpf.tpfParser.ParametroContext;
import tpf.tpfParser.ParamsContext;
import tpf.tpfParser.RelacionalContext;
import tpf.tpfParser.TermContext;
import tpf.tpfParser.ValorContext;
import tpf.tpfParser.DeclaracionContext;
import tpf.tpfParser.DeclaracionesContext;
import tpf.tpfParser.P_listaContext;

public class miListener extends tpfBaseListener {
    private TablaSimbolos tabla = new TablaSimbolos();
    private String[] ruleNames;
    private List<String> errores = new ArrayList<String>();
    private List<String> salidaContextos = new ArrayList<String>();
    private List<String> warnings = new ArrayList<String>();
    private File fileout;
    private FileWriter output;
    
    public List<String> getErrores() {
        return errores;
    }

    miListener(tpfParser parser){
        this.ruleNames = parser.getRuleNames();
        tabla.addContexto("GLOBAL");
        salidaContextos.add("TABLA DE SíMBOLOS:\nContexto: GLOBAL {");
        try{
            fileout = new File("output/analisis.txt");
            output = new FileWriter(fileout);
            output.write("");
            output.close();
            output = new FileWriter(fileout,true);
        }catch(Exception e){
            System.err.println(e);
        }
    }

    @Override
    public void exitDeclaraciones(DeclaracionesContext ctx) {
        String i;
        String t = ctx.tipo().getText();
        DeclaracionContext declaracion = ctx.declaracion();
        D_listaContext dLista = ctx.d_lista();
        boolean iniciar = false;

        do {
            if (declaracion.ID() == null){
                i = declaracion.asignacion().ID().getText();
                iniciar = true;
            }
            else{
                i = declaracion.ID().getText();
            }

            if (tabla.buscarIdLocal(i)!=null){
                int linea = ctx.getStart().getLine();
                errores.add("Semantic Error line "+linea+": Redeclaración de variable \'"+
                i+"\' en el mismo contexto");
                System.out.println(errores.get(errores.size()-1));
            }
            else{
                tabla.addId(new Variable(i, t));
                if (iniciar) tabla.buscarIdLocal(i).inicializar();
            }

            declaracion = dLista.declaracion();
            dLista = dLista.d_lista();
        } while (dLista != null);

    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        String reglaPadre = ruleNames[ctx.getParent().getRuleIndex()];
        if (reglaPadre!="declaracion"){
            String i = ctx.ID().getText();
            ID v = tabla.buscarIdLocal(i);
            if(v!=null){
                String tipo = v.tipo;
                if (tiposIncompatibles(tipo, getTipo(ctx.opal()))){
                    int linea = ctx.getStart().getLine();
                    errores.add("Semantic Error line "+linea+": El tipo asignado es incompatible con el tipo declarado para "+v.idName);
                    System.out.println(errores.get(errores.size()-1));
                }
                else
                    v.inicializar();
            }
            else{
                v = tabla.buscarId(i);
                if(v!=null){
                    String tipo = v.tipo;
                    if (tiposIncompatibles(tipo, getTipo(ctx.opal()))){
                        int linea = ctx.getStart().getLine();
                        errores.add("Semantic Error line "+linea+": El tipo asignado es incompatible con el tipo declarado para "+v.idName);
                        System.out.println(errores.get(errores.size()-1));
                    }
                    else
                        v.inicializar();
                }
                else{
                    int linea = ctx.getStart().getLine();
                    errores.add("Semantic Error line "+linea+": La variable \'"+
                                i +"\' no ha sido previamente declarada");
                    System.out.println(errores.get(errores.size()-1));
                }
            }
        }
    }

    @Override
    public void enterBloque(BloqueContext ctx) {
        ParserRuleContext context = ctx.getParent();
        String identificador;
        if (ruleNames[context.getRuleIndex()]=="def_func"){
            identificador = ((Def_funcContext) context).ID().getText();
        }
        else{
            identificador = context.getParent().getStart().getText();
        }  
        
        String tabs = "";
        for(int i=0;i<tabla.size();i++){
            tabs = tabs+"\t";
        }
        tabla.addContexto(identificador);
        String rule = this.ruleNames[ctx.getParent().getRuleIndex()];
        if (rule == "def_func"){
            ParamsContext params = ((Def_funcContext)ctx.getParent()).params();
            while (params!=null && params.getChildCount()!=0){
                if (params.ID()!=null){
                    String id = params.ID().getText();
                    String tipo = params.tipo().getText();
                    tabla.addId(new Variable(id,tipo));
                }
                if (params.defp_lista().getChildCount()!=0){
                    params = params.defp_lista().params();
                }
                else params = null;
            }
        }
        salidaContextos.add(tabs+"Contexto: "+identificador+" {");
    }

    @Override
    public void exitBloque(BloqueContext ctx) {
        String tabs = "";
        for(int i=0;i<tabla.size();i++){
            tabs = tabs+"\t";
        }
        for (ID id : tabla.lastContext().getSimbolos().values()) {
            salidaContextos.add(tabs+id.toString());
            if (!id.utilizado){
                warnings.add("Warning: El identificador "+id.idName+" declarado no ha sido utilizado");
            }
        }
        tabs = tabs.substring(0,tabs.length()-1);
        salidaContextos.add(tabs+"}");
        tabla.delContexto();
    }

    @Override
    public void exitDec_func(Dec_funcContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Funcion func = new Funcion(id, tipo);
        P_listaContext pLista = ctx.parametros().p_lista();
        ParametroContext pm = ctx.parametros().parametro();
        while (pm != null && pm.getChildCount()!=0){
            func.addArg(pm.tipo().getText());
            if (pLista.getChildCount()!=0){
                pm = pLista.parametros().parametro();
                pLista = pLista.parametros().p_lista();
            }
            else{
                pm = null;
            }
        }
        tabla.addId(func);
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        errores.add("Semantic Error node: "+node.getText());
        System.out.println(errores.get(errores.size()-1));
    }

    @Override
    public void exitDef_func(Def_funcContext ctx) {
        String id = ctx.ID().getText();
        String tipo = ctx.tipo().getText();
        Funcion func = new Funcion(id, tipo);
        func.inicializar();
        ParamsContext params = ctx.params();

        while (params != null && params.getChildCount() !=0){
            if (params.tipo()!=null) func.addArg(params.tipo().getText());
            else func.addArg(params.VOID().getText());

            if (params.defp_lista().getChildCount() != 0){
                params = params.defp_lista().params();
            }
            else{
                params = null;
            }
        }
        
        tabla.addId(func);
    }

    @Override
    public void exitValor(ValorContext ctx) {
        if (ctx.ID()!=null){
            String id = ctx.ID().getText();
            ID i = tabla.buscarIdLocal(id);
            if (i==null) i = tabla.buscarId(id);
            if (i==null) {
                int linea = ctx.getStart().getLine();
                errores.add("Semantic Error line "+linea+": El identificador "+
                                id+" no ha sido declarado");
                System.out.println(errores.get(errores.size()-1));
            }
            else{
                i.usar();
            }
        }
    }

    @Override
    public void exitLlam_func(Llam_funcContext ctx) {
        String id = ctx.ID().getText();
        ID i = tabla.buscarIdLocal(id);
        if (i==null) i = tabla.buscarId(id);
        if (i==null) {
            int linea = ctx.getStart().getLine();
            errores.add("Semantic Error line "+linea+": El identificador "+
                        id+" no ha sido declarado");
            System.out.println(errores.get(errores.size()-1));
        }
        else{
            boolean correctParams = true;
            List<String> params = ((Funcion)i).getArgs();
            List<String> args = new ArrayList<String>();
            listaTipos(ctx.argumentos(), args);
            correctParams = params.size() == args.size();
            int j;
            for (j=0; correctParams && j < args.size(); j++) {
                correctParams = !tiposIncompatibles(args.get(j), params.get(j));
                if (!correctParams) break;
            }
            if (params.size()==1 && params.contains("void") && args.size()==0) correctParams = true;
            if (correctParams) i.usar();
            else {
                if (params.size() != args.size()) errores.add("Semantic Error line "+ctx.getStart().getLine()+": la cantidad de argumentos entregados"+
                                                                    " en la llamada de la función "+i.idName+" no se corresponde con la cantidad de parámetros"+
                                                                    " en la declaración de la misma");
                else errores.add("Semantic Error line "+ctx.getStart().getLine()+": "+
                "Se esperaba el tipo "+(params.size()==0?"empty":params.get(j))+" en la funcion "+
                i.idName+", pero el tipo "+(args.size()==0?"empty":args.get(j))+" fue entregado");

                System.out.println(errores.get(errores.size()-1));
            }
        }
    }

    private String getTipo(ParserRuleContext ctx){
        String tipo = "";
        String rule = this.ruleNames[ctx.getRuleIndex()];
        if (rule == "opal"){
            if (getTipo(((OpalContext)ctx).relacional()) == "void")
                tipo = "void";
            else if (((OpalContext)ctx).negacion().getChildCount()==0 && ((OpalContext)ctx).logic().getChildCount()==0){
                tipo = getTipo(((OpalContext)ctx).relacional());
            }
            else tipo = "int";
        }
        else if (rule == "relacional"){
            int hijos = ((RelacionalContext)ctx).getChildCount();
            if (hijos == 3) tipo = getTipo(((RelacionalContext)ctx).opal());
            else if (((RelacionalContext)ctx).rel()!= null && ((RelacionalContext)ctx).rel().getChildCount() == 2){
                if (getTipo(((RelacionalContext)ctx).opar()) != "void" &&
                    getTipo(((RelacionalContext)ctx).rel().opar()) != "void")
                    tipo = "int";
                else tipo = getTipo(((RelacionalContext)ctx).opar());
            }
            else tipo = getTipo(((RelacionalContext)ctx).opar());
        }
        else if (rule == "opar"){
            if (((OparContext)ctx).operacion().getChildCount() != 0){
                String tTipo = getTipo(((OparContext)ctx).term());
                String oTipo = getTipo(((OparContext)ctx).operacion());
                if (tTipo == "void" || oTipo == "void") tipo = "void";
                else if (tTipo == "double" || oTipo == "double") tipo = "double";
                else if (tTipo == "char" || oTipo == "char") tipo = "char";
                else tipo = "int";
            }
            else tipo = getTipo(((OparContext)ctx).term());
        }
        else if (rule == "operacion") tipo = getTipo(((OperacionContext)ctx).opar());
        else if (rule == "term"){
            if (((TermContext)ctx).mult().getChildCount() != 0){
                String oTipo = getTipo(((TermContext)ctx).ovalor());
                String mTipo = getTipo(((TermContext)ctx).mult());
                if (mTipo == "void" || oTipo == "void") tipo = "void";
                else if (mTipo == "double" || oTipo == "double") tipo = "double";
                else if (mTipo == "char" || oTipo == "char") tipo = "char";
                else tipo = "int";
            }
            else tipo = getTipo(((TermContext)ctx).ovalor());
        }
        else if (rule == "ovalor"){
            if (((OvalorContext)ctx).getChildCount() == 1) tipo = getTipo(((OvalorContext)ctx).valor());
            else tipo = getTipo(((OvalorContext)ctx).opar());
        }
        else if (rule == "valor"){
            if (((ValorContext)ctx).llam_func() != null) 
                tipo = this.tabla.buscarId(((ValorContext)ctx).llam_func().ID().getText()).tipo;
            else if (((ValorContext)ctx).ID() != null)
                tipo = this.tabla.buscarId(((ValorContext)ctx).ID().getText()).tipo;
            else if (((ValorContext)ctx).numero() != null)
                tipo = (((ValorContext)ctx).numero().ENTERO()!=null?"int":"double");
            else if (((ValorContext)ctx).VCHAR()!=null)
                tipo = "char";
            else if (((ValorContext)ctx).VSTRING()!=null) tipo = "char*";
        }
        return tipo;
    }

    private boolean tiposIncompatibles(String a, String b){
        if (a == "void" || b == "void") return true;
        else if (a.contains("*") && !(b.contains("*"))) return true;
        else if (!(a.contains("*")) && (b.contains("*"))) return true;
        else if (a.contains("*") && b.contains("*")) return tiposIncompatibles(a.replace("*", ""), b.replace("*", ""));
        else return false;
    }

    private void listaTipos(ParserRuleContext ctx, List<String> lista){
        String rule = ruleNames[ctx.getRuleIndex()];
        if (rule == "llam_func") listaTipos(((Llam_funcContext)ctx).argumentos(), lista);
        else if (rule == "argumentos" && ctx.getChildCount() != 0){
            listaTipos(((ArgumentosContext)ctx).argumento(), lista);
            listaTipos(((ArgumentosContext)ctx).a_lista(), lista);
        }
        else if (rule == "argumento"){
            if (((ArgumentoContext)ctx).asignacion() != null){
                listaTipos(((ArgumentoContext)ctx).asignacion(), lista);
            }
            else {
                lista.add(getTipo(((ArgumentoContext)ctx).opal()));
            }
        }
        else if (rule == "a_lista"){
            if (((A_listaContext)ctx).getChildCount() != 0){
                listaTipos(((A_listaContext)ctx).argumentos(), lista);
            }
        }
    }

    @Override
    public void exitIeof(IeofContext ctx) {
        //System.out.println();
        try {
            for (ID id : tabla.lastContext().getSimbolos().values()) {
                salidaContextos.add("\t"+id.toString());
                if (!id.utilizado){
                    warnings.add("Warning: El identificador "+id.idName+" declarado no ha sido utilizado");
                }
            }
            salidaContextos.add("}\n");
            for (String linea : salidaContextos) {
                output.write(linea+"\n");
            }
            output.write("\nWARNINGS\n");
            for (String warning : warnings) {
                output.write(warning+"\n");
            }
            output.write("\nERRORES\n");
            for (String error : errores) {
                output.write(error+"\n");
            }
            output.close();
        } catch (Exception e) {
            System.err.println(e);
        }

        System.out.println("Saliendo del programa.\nLa tabla de símbolos y los errores y warnings generados se "+
                            "almacenaron en el archivo output/analisis.txt");
    }

    
}
