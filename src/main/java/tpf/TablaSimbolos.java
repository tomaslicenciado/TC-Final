package tpf;

import java.util.ArrayList;
import java.util.List;

public class TablaSimbolos {
    private List<Contexto> contextos;

    public TablaSimbolos(){
        contextos = new ArrayList<Contexto>();
    }

    public void addContexto(String identificador){
        contextos.add(new Contexto(identificador));
    }

    public void delContexto(){
        contextos.remove(contextos.size() -1);
    }

    public ID buscarId (String id){
        ID r = null;
        int index = 0;
        while (r == null && index < contextos.size()){
            r = contextos.get(index).get(id);
            index++;
        }
        return r;
    }

    public ID buscarIdLocal (String id){
        return (contextos.size() != 0? contextos.get(contextos.size()-1).get(id) : null);
    }

    public void addId (ID id){
        contextos.get(contextos.size()-1).put(id);
    }

    @Override
    public String toString() {
        return "TablaSimbolos [" + contextos + "]";
    }

    public Contexto lastContext(){
        return contextos.get(contextos.size()-1);
    }

    public int size(){
        return contextos.size();
    }
}
