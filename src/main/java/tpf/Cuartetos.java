package tpf;

import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.List;

import org.javatuples.Quartet;

public class Cuartetos {

    private List<Quartet<String,String,String,String>> cuartetos;
    private List<String> temporales;
    private List<String> etiquetas;
    private List<String> argumentos;
    private String addr = "";
    private String op = "";
    private int cantL = 0;


    public Cuartetos(){
        this.cuartetos = new ArrayList<Quartet<String,String,String,String>>();
        this.etiquetas = new ArrayList<String>();
        this.temporales = new ArrayList<String>();
        this.argumentos = new ArrayList<String>();
    }

    public String addCuarteto (String op, String arg1, String arg2, String res){
        this.cuartetos.add(new Quartet<String,String,String,String>(op, arg1, arg2, res));
        this.clean();
        return res;
    }

    public void addId (String id){
        this.etiquetas.add(id);
    }

    public String newLabel(){
        this.cantL ++;
        String label = "L" + Integer.toString(this.cantL);
        this.etiquetas.add(label);
        return label;
    }

    public String newTemp(){
        String tmp = "t" + Integer.toString(this.temporales.size() +1);
        this.temporales.add(tmp);
        return tmp;
    }

    public String getTemp (int i){
        if (i < 0){
            return "";
        }
        else if (i >= this.temporales.size()){
            return "";
        }
        else {
            return this.temporales.get(i);
        }
    }

    public int cantTemp(){
        return this.temporales.size();
    }

    public void setAddr(String addr2) {
        this.addr = addr2;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getAddr() {
        return addr;
    }

    public String getOp() {
        return op;
    }

    private void clean(){
        this.addr = "";
        this.op = "";
    }

    public String getThreeAddressCode(){
        String TAC="Código de tres direcciones:\n\n";
        Quartet<String,String,String,String> quartet;
        for (int i = 0; i < cuartetos.size(); i++) {
            quartet = cuartetos.get(i);
            if (quartet.getValue0() == "label"){
                TAC += quartet.getValue1() + ": ";
            }
            else if (quartet.getValue0() == "replace"){
                String id = quartet.getValue1();
                String temp = quartet.getValue2();
                for (int j = i+1; j < cuartetos.size(); j++){
                    if (cuartetos.get(j).getValue1() != null && cuartetos.get(j).getValue1().equals(id)){
                        cuartetos.set(j, cuartetos.get(j).setAt1(temp));
                    }
                    if (cuartetos.get(j).getValue2() != null && cuartetos.get(j).getValue2().equals(id)){
                        cuartetos.set(j, cuartetos.get(j).setAt2(temp));
                    }
                    if (cuartetos.get(j).getValue3() != null && cuartetos.get(j).getValue3().equals(id)){
                        cuartetos.set(j, cuartetos.get(j).setAt3(temp));
                    }

                    if (cuartetos.get(j).getValue0() == "endp"){
                        j = cuartetos.size();
                    }
                }
            }
            else if (quartet.getValue0() == "if"){
                TAC += "if (" + quartet.getValue1() + ") goto " + quartet.getValue3() + "\n";
            }
            else if (quartet.getValue3() != ""){
                if (quartet.getValue2() != ""){
                    TAC += quartet.getValue3() + " := " + quartet.getValue1() + " " + quartet.getValue0() + " " + quartet.getValue2() + "\n";
                }
                else{
                    TAC += quartet.getValue3() + " := " + quartet.getValue0() + " " + quartet.getValue1() + "\n";
                }
            }
            else if (quartet.getValue2() != ""){
                TAC += quartet.getValue1() + " " + quartet.getValue0() + " " + quartet.getValue2() + "\n";
            }
            else{
                TAC += quartet.getValue0() + " " + quartet.getValue1() + "\n";
                if (quartet.getValue0() == "endp"){
                    TAC += "\n";
                }
            }

        }
        return TAC;
    }

    public void addArg (String arg){
        this.argumentos.add(arg);
    }

    public int cantArg(){
        return this.argumentos.size();
    }

    public String getArg(int i){
        return this.argumentos.get(i);
    }

    public void cleanArgs(){
        this.argumentos.clear();
    }

    private static boolean isNumeric(String str) {
        ParsePosition pos = new ParsePosition(0);
        NumberFormat.getInstance().parse(str, pos);
        return str.length() == pos.getIndex();
    }
    
    public void optimizar(){
        Quartet<String,String,String,String> cuarteto;
        for (int i=0; i<cuartetos.size(); i++){
            cuarteto = cuartetos.get(i);

            //Optimizamos las operaciones aritmeticas
            if (cuarteto.getValue0() != ""){
                if (cuarteto.getValue2() != ""){
                    if (isNumeric(cuarteto.getValue1()) && isNumeric(cuarteto.getValue2())){
                        int n1 = Integer.parseInt(cuarteto.getValue1());
                        int n2 = Integer.parseInt(cuarteto.getValue2());
                        int r = 0;
                        switch (cuarteto.getValue0()) {
                            case "-":
                                r = n1 - n2;
                                break;
                            case "+":
                                r = n1 + n2;
                                break;
                            case "*":
                                r = n1 * n2;
                                break;
                            case "/":
                                r = n1 / n2;
                                break;
                            case "%":
                                r = n1 % n2;
                                break;
                            default:
                                break;
                        }
                        cuartetos.set(i, new Quartet<String,String,String,String>("", Integer.toString(r), "", cuarteto.getValue3()));
                    }
                }
            }

            //Optimizamos el uso de temporales
            if (cuarteto.getValue3() != ""){
                if (cuarteto.getValue2() == "" && cuarteto.getValue0() == ""){
                    Quartet<String,String,String,String> cAnt;
                    for (int j = 0; j<i; j++){
                        cAnt = cuartetos.get(j);
                        if (cAnt.getValue3() == cuarteto.getValue1()){
                            cuartetos.set(j, cAnt.setAt3(cuarteto.getValue3()));
                        }
                    }
                    cuartetos.remove(i);
                    i--;
                }
            }
        }
    }
}
