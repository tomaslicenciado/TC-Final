package tpf;

import java.util.HashMap;
import java.util.Map;

public class Contexto {
    private String identificador;
    private Map<String,ID> simbolos;

    public Contexto(String identificador) {
        this.identificador = identificador;
        this.simbolos = new HashMap<String,ID>();
    }

    public String getIdentificador() {
        return identificador;
    }

    public Map<String, ID> getSimbolos() {
        return simbolos;
    }

    public ID get(String id){
        return this.simbolos.get(id);
    }

    public void put(ID id){
        this.simbolos.put(id.idName, id);
    }

    public String toString(){
        return (this.identificador + " = " + this.simbolos + "\n");
    }
}
