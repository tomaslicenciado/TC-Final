package tpf;

import java.util.ArrayList;
import java.util.List;

public class Funcion extends ID{
    private List<String> args;

    public Funcion(String name, String tipo) {
        super(name, tipo);
        args = new ArrayList<String>();
    }

    public void addArg(String arg){
        args.add(arg);
    }

    public List<String> getArgs(){
        return args;
    }

    public String toString(){
        return ("FUNCION - "+super.toString() + ", Args: " + args);
    }

}
