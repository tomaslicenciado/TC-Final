package tpf;

import tpf.tpfParser.A_listaContext;
import tpf.tpfParser.AccionesContext;
import tpf.tpfParser.ArgumentoContext;
import tpf.tpfParser.ArgumentosContext;
import tpf.tpfParser.AsignacionContext;
import tpf.tpfParser.BloqueContext;
import tpf.tpfParser.Cf_listaContext;
import tpf.tpfParser.Comienzos_fContext;
import tpf.tpfParser.D_listaContext;
import tpf.tpfParser.DeclaracionContext;
import tpf.tpfParser.DeclaracionesContext;
import tpf.tpfParser.Def_funcContext;
import tpf.tpfParser.Defp_listaContext;
import tpf.tpfParser.Est_controlContext;
import tpf.tpfParser.Fin_fContext;
import tpf.tpfParser.FuncionContext;
import tpf.tpfParser.IelseContext;
import tpf.tpfParser.IforContext;
import tpf.tpfParser.IifContext;
import tpf.tpfParser.Inst_simpleContext;
import tpf.tpfParser.InstruccionContext;
import tpf.tpfParser.InstruccionesContext;
import tpf.tpfParser.IreturnContext;
import tpf.tpfParser.IwhileContext;
import tpf.tpfParser.Llam_funcContext;
import tpf.tpfParser.LogicContext;
import tpf.tpfParser.MultContext;
import tpf.tpfParser.OpalContext;
import tpf.tpfParser.OparContext;
import tpf.tpfParser.OpcionContext;
import tpf.tpfParser.OpcionesContext;
import tpf.tpfParser.OperacionContext;
import tpf.tpfParser.OvalorContext;
import tpf.tpfParser.ParamsContext;
import tpf.tpfParser.RelContext;
import tpf.tpfParser.RelacionalContext;
import tpf.tpfParser.SiContext;
import tpf.tpfParser.TermContext;
import tpf.tpfParser.ValorContext;

public class miVisitor extends tpfBaseVisitor<String> {
    private Cuartetos cuartetos = new Cuartetos();

    @Override
    public String visitSi(SiContext ctx) {
        visit(ctx.opciones());
        System.out.println("SIN OPTIMIZAR:\n");
        System.out.println(this.cuartetos.getThreeAddressCode());
        System.out.println("\n");
        this.cuartetos.optimizar();
        return this.cuartetos.getThreeAddressCode();
    }

    @Override
    public String visitOpciones(OpcionesContext ctx) {
        if (ctx.opciones() != null){
            if (ctx.funcion()!= null)
                visit(ctx.funcion());
            else if (ctx.asignacion() != null)
                visit(ctx.asignacion());
            else
                visit(ctx.declaraciones());
            visit(ctx.opciones());
        }
        return "";
    }

    @Override
    public String visitFuncion(FuncionContext ctx) {
        if (ctx.def_func() != null){
            visit(ctx.def_func());
        }
        return "";
    }

    @Override
    public String visitDef_func(Def_funcContext ctx) {
        String label = ctx.ID().getText();
        this.cuartetos.addCuarteto("proc", label, "", "");
        visit(ctx.params());
        visit(ctx.bloque());
        this.cuartetos.addCuarteto("endp", label, "", "");
        return "";
    }

    @Override
    public String visitParams(ParamsContext ctx) {
        if (ctx.ID() != null){
            String newTemp = this.cuartetos.newTemp();
            this.cuartetos.addCuarteto("pop", newTemp, "", "");
            this.cuartetos.addCuarteto("replace", ctx.ID().getText(), newTemp, "");
        }
        visit(ctx.defp_lista());
        return "";
    }

    @Override
    public String visitDefp_lista(Defp_listaContext ctx) {
        if (ctx.params() != null){
            return visit(ctx.params());
        }
        return "";
    }

    @Override
    public String visitBloque(BloqueContext ctx) {
        return visit(ctx.instrucciones());
    }

    @Override
    public String visitInstrucciones(InstruccionesContext ctx) {
        if (ctx.instruccion() != null){
            visit(ctx.instruccion());
            visit(ctx.instrucciones());
        }
        return "";
    }

    @Override
    public String visitInstruccion(InstruccionContext ctx) {
        if (ctx.inst_simple() != null){
            visit(ctx.inst_simple());
        }
        else if (ctx.est_control() != null){
            visit(ctx.est_control());
        }
        else if (ctx.ireturn() != null){
            visit(ctx.ireturn());
        }
        return "";
    }

    @Override
    public String visitInst_simple(Inst_simpleContext ctx) {
        if (ctx.declaraciones() != null){
            visit(ctx.declaraciones());
        }
        else if (ctx.asignacion() != null){
            visit(ctx.asignacion());
        }
        else if (ctx.opal() != null){
            visit(ctx.opal());
        }
        return "";
    }

    @Override
    public String visitDeclaraciones(DeclaracionesContext ctx) {
        visit(ctx.declaracion());
        visit(ctx.d_lista());
        return "";
    }

    @Override
    public String visitDeclaracion(DeclaracionContext ctx) {
        if (ctx.asignacion() != null){
            visit(ctx.asignacion());
        }
        return "";
    }

    @Override
    public String visitD_lista(D_listaContext ctx) {
        if (ctx.declaracion() != null){
            visit(ctx.declaracion());
        }
        return "";
    }

    @Override
    public String visitAsignacion(AsignacionContext ctx) {
        String id = ctx.ID().getText();
        this.cuartetos.addCuarteto("", visit(ctx.opal()), "", id);
        return id;
    }

    @Override
    public String visitOpal(OpalContext ctx) {
        String rTemp;
        String addr1 = visit(ctx.relacional());

        if (ctx.negacion().getText() != ""){
            String temp = this.cuartetos.addCuarteto("==", addr1, "0", this.cuartetos.newTemp());
            String l1 = this.cuartetos.addCuarteto("if", temp, "goto", this.cuartetos.newLabel());
            this.cuartetos.addCuarteto("", "0", "", addr1);
            String l2 = this.cuartetos.newLabel();
            this.cuartetos.addCuarteto("goto", l2, "", "");
            this.cuartetos.addCuarteto("label", l1, "", "");
            this.cuartetos.addCuarteto("", "1", "", addr1);
            this.cuartetos.addCuarteto("label", l2, "", "");
        }

        if (ctx.logic().opal() == null){
            return addr1;
        }
        else{
            this.cuartetos.setAddr(addr1);
            String temp = visit(ctx.logic());
            String l1 = this.cuartetos.addCuarteto("if", temp, "goto", this.cuartetos.newLabel());
            rTemp = this.cuartetos.addCuarteto("", "0", "", this.cuartetos.newTemp());
            String l2 = this.cuartetos.newLabel();
            this.cuartetos.addCuarteto("goto", l2, "", "");
            this.cuartetos.addCuarteto("label", l1, "", "");
            this.cuartetos.addCuarteto("", "1", "", rTemp);
            this.cuartetos.addCuarteto("label", l2, "", "");
        }
        return rTemp;
    }

    @Override
    public String visitLogic(LogicContext ctx) {
        if (ctx.getText()==""){
            return "";
        }
        else{
            String addr2 = visit(ctx.opal());
            String addr1 = this.cuartetos.getAddr();
            if (ctx.AND() != null){
                String l1 = this.cuartetos.addCuarteto("if", addr1, "goto", this.cuartetos.newLabel());
                String r = this.cuartetos.addCuarteto("", "0", "", this.cuartetos.newTemp());
                String l2 = this.cuartetos.newLabel();
                this.cuartetos.addCuarteto("goto", l2, "", "");
                this.cuartetos.addCuarteto("label", l1, "", "");
                String l3 = this.cuartetos.addCuarteto("if", addr2, "goto", this.cuartetos.newLabel());
                this.cuartetos.addCuarteto("", "0", "", r);
                this.cuartetos.addCuarteto("goto", l2, "", "");
                this.cuartetos.addCuarteto("label", l3, "", "");
                this.cuartetos.addCuarteto("", "1", "", r);
                this.cuartetos.addCuarteto("label", l2, "", "");
                return r;
            }
            else{
                String l1 = this.cuartetos.addCuarteto("if", addr1, "goto", this.cuartetos.newLabel());
                this.cuartetos.addCuarteto("if", addr2, "goto", l1);
                String r = this.cuartetos.addCuarteto("", "0", "", this.cuartetos.newTemp());
                String l2 = this.cuartetos.newLabel();
                this.cuartetos.addCuarteto("goto", l2, "", "");
                this.cuartetos.addCuarteto("label", l1, "", "");
                this.cuartetos.addCuarteto("", "1", "", r);
                this.cuartetos.addCuarteto("label", l2, "", "");
                return r;
            }
        }
    }

    @Override
    public String visitRelacional(RelacionalContext ctx) {
        if (ctx.opal() != null){
            return visit(ctx.opal());
        }
        else if (ctx.rel().CMP() == null){
            return visit(ctx.opar());
        }
        else{
            visit(ctx.rel());
            String cTemp = this.cuartetos.addCuarteto(this.cuartetos.getOp(), visit(ctx.opar()), this.cuartetos.getAddr(), this.cuartetos.newTemp());
            String l1 = this.cuartetos.addCuarteto("if", cTemp, "goto", this.cuartetos.newLabel());
            String rTemp = this.cuartetos.addCuarteto("", "0", "", this.cuartetos.newTemp());
            String l2 = this.cuartetos.newLabel();
            this.cuartetos.addCuarteto("goto", l2, "", "");
            this.cuartetos.addCuarteto("label", l1, "", "");
            this.cuartetos.addCuarteto("", "1", "", rTemp);
            this.cuartetos.addCuarteto("label", l2, "", "");
            return rTemp;
        }
    }

    @Override
    public String visitRel(RelContext ctx) {
        if (ctx.getText()==""){
            return "";
        }
        else{
            String child = visit(ctx.opar());
            if (ctx.CMP() != null){
                this.cuartetos.setOp(ctx.CMP().getText());
            }
            this.cuartetos.setAddr(child);
            return child;
        }
    }

    @Override
    public String visitOpar(OparContext ctx) {
        String addr1 = visit(ctx.term());
        if (ctx.operacion().opar() == null){
            return addr1;
        }
        else{
            visit(ctx.operacion());
            return this.cuartetos.addCuarteto(this.cuartetos.getOp() ,addr1, this.cuartetos.getAddr(), this.cuartetos.newTemp());
        }
    }

    @Override
    public String visitTerm(TermContext ctx) {
        String addr1 = visit(ctx.ovalor());

        if (ctx.menos().RESTA() != null){
            addr1 = this.cuartetos.addCuarteto("uminus", addr1, "", this.cuartetos.newTemp());
        }

        if (ctx.mult().getText() == ""){
            return addr1;
        }
        else{
            visit(ctx.mult());
            return this.cuartetos.addCuarteto(this.cuartetos.getOp(), addr1, this.cuartetos.getAddr(), this.cuartetos.newTemp());
        }
    }

    @Override
    public String visitMult(MultContext ctx) {
        if (ctx.getText()==""){
            return "";
        }
        else{
            String child = visit(ctx.term());
            if (ctx.MULT() != null){
                this.cuartetos.setOp("*");
            }
            else if (ctx.DIV() != null){
                this.cuartetos.setOp("/");
            }
            else if (ctx.MOD() != null){
                this.cuartetos.setOp("%");
            }
            this.cuartetos.setAddr(child);
            return child;
        }
    }

    @Override
    public String visitOvalor(OvalorContext ctx) {
        if (ctx.valor() != null)
            return visit(ctx.valor());
        else
            return visit(ctx.opar());
    }

    @Override
    public String visitValor(ValorContext ctx) {
        if (ctx.llam_func() != null){
            return visit(ctx.llam_func());
        }
        else if (ctx.ID() != null){
            return ctx.ID().getText();
        }
        else if (ctx.numero() != null){
            return ctx.numero().getText();
        }
        else if (ctx.VCHAR() != null){
            return ctx.VCHAR().getText();
        }
        else{
            return ctx.VSTRING().getText();
        }
    }

    @Override
    public String visitLlam_func(Llam_funcContext ctx) {
        String idLabel = ctx.ID().getText();
        visit(ctx.argumentos());
        for (int i = this.cuartetos.cantArg() -1; i >= 0 ; i--) {
            this.cuartetos.addCuarteto("push", this.cuartetos.getArg(i), "", "");
        }
        this.cuartetos.addCuarteto("call", idLabel, "", "");
        this.cuartetos.cleanArgs();
        String returnT = this.cuartetos.newTemp();
        this.cuartetos.addCuarteto("pop", returnT, "", "");
        return returnT;
    }

    @Override
    public String visitArgumentos(ArgumentosContext ctx) {
        if (ctx.argumento() != null){
            visit(ctx.argumento());
            visit(ctx.a_lista());
        }
        return "";
    }

    @Override
    public String visitArgumento(ArgumentoContext ctx) {
        if (ctx.asignacion() != null)
            this.cuartetos.addArg(visit(ctx.asignacion()));
        else
            this.cuartetos.addArg(visit(ctx.opal()));
        return "";
    }

    @Override
    public String visitA_lista(A_listaContext ctx) {
        if (ctx.argumentos() != null)
            visit(ctx.argumentos());
        return "";
    }

    @Override
    public String visitOperacion(OperacionContext ctx) {
        if (ctx.getText()==""){
            return "";
        }
        else{
            String child = visit(ctx.opar());
            if (ctx.SUMA() != null){
                this.cuartetos.setOp("+");
            }
            else if (ctx.RESTA() != null){
                this.cuartetos.setOp("-");
            }
            this.cuartetos.setAddr(child);
            return child;
        }
    }

    @Override
    public String visitIreturn(IreturnContext ctx) {
        if (ctx.opal() != null){
            String r = visit(ctx.opal());
            this.cuartetos.addCuarteto("push", r, "", "");
            return r;
        }
        else{
            this.cuartetos.addCuarteto("push", "", "", "");
            return "";
        }
    }
    
    @Override
    public String visitEst_control(Est_controlContext ctx) {
        if (ctx.iif() != null)
            visit(ctx.iif());
        else if (ctx.iwhile() != null)
            visit(ctx.iwhile());
        else
            visit(ctx.ifor());
        return "";
    }

    @Override
    public String visitIwhile(IwhileContext ctx) {
        String whileLabel = this.cuartetos.newLabel(),
                noLabel = this.cuartetos.newLabel(),
                lbl;
        this.cuartetos.addCuarteto("label", whileLabel, "", "");
        visit(ctx.argumentos());
        for (int i=this.cuartetos.cantArg()-1; i>=0; i--){
            lbl = this.cuartetos.addCuarteto("if", this.cuartetos.getArg(i), "goto", this.cuartetos.newLabel());
            this.cuartetos.addCuarteto("goto", noLabel, "", "");
            this.cuartetos.addCuarteto("label", lbl, "", "");
        }
        this.cuartetos.cleanArgs();
        visit(ctx.acciones());
        this.cuartetos.addCuarteto("goto", whileLabel, "", "");
        this.cuartetos.addCuarteto("label", noLabel, "", "");
        return "";
    }

    @Override
    public String visitAcciones(AccionesContext ctx) {
        if (ctx.asignacion() != null)
            visit(ctx.asignacion());
        else if (ctx.opal() != null)
            visit(ctx.opal());
        else if (ctx.bloque() != null)
            visit(ctx.bloque());
        return "";
    }

    @Override
    public String visitIif(IifContext ctx) {
        visit(ctx.argumentos());
        String noLbl = this.cuartetos.newLabel();
        String lbl;
        for (int i = this.cuartetos.cantArg() -1; i>=0; i--){
            lbl = this.cuartetos.addCuarteto("if", this.cuartetos.getArg(i), "goto", this.cuartetos.newLabel());
            this.cuartetos.addCuarteto("goto", noLbl, "", "");
            this.cuartetos.addCuarteto("label", lbl, "", "");
        }
        this.cuartetos.cleanArgs();
        visit(ctx.acciones());
        this.cuartetos.addCuarteto("label", noLbl, "", "");
        visit(ctx.ielse());
        return "";
    }

    @Override
    public String visitIelse(IelseContext ctx) {
        if (ctx.ELSE() != null){
            if (ctx.iif() != null)
                visit(ctx.iif());
            else
                visit(ctx.acciones());
        }
        return "";
    }

    @Override
    public String visitIfor(IforContext ctx) {
        visit(ctx.comienzos_f());
        String whileLabel = this.cuartetos.newLabel(),
                noLabel = this.cuartetos.newLabel(),
                lbl;
        this.cuartetos.addCuarteto("label", whileLabel, "", "");
        visit(ctx.argumentos());
        for (int i = this.cuartetos.cantArg()-1; i>=0; i--){
            lbl = this.cuartetos.addCuarteto("if", this.cuartetos.getArg(i), "goto", this.cuartetos.newLabel());
            this.cuartetos.addCuarteto("goto", noLabel, "", "");
            this.cuartetos.addCuarteto("label", lbl, "", "");
        }
        this.cuartetos.cleanArgs();
        visit(ctx.acciones());
        visit(ctx.fin_f());
        this.cuartetos.addCuarteto("goto", whileLabel, "", "");
        this.cuartetos.addCuarteto("label", noLabel, "", "");
        return "";
    }

    @Override
    public String visitComienzos_f(Comienzos_fContext ctx) {
        if (ctx.opcion() != null){
            visit(ctx.opcion());
            visit(ctx.cf_lista());
        }
        return "";
    }

    @Override
    public String visitOpcion(OpcionContext ctx) {
        if (ctx.declaracion() != null)
            visit(ctx.declaracion());
        else
            visit(ctx.argumento());
        return "";
    }

    @Override
    public String visitCf_lista(Cf_listaContext ctx) {
        if (ctx.COMA() != null){
            visit(ctx.opcion());
            visit(ctx.cf_lista());
        }
        return "";
    }

    @Override
    public String visitFin_f(Fin_fContext ctx) {
        return visit(ctx.argumentos());
    }
}
