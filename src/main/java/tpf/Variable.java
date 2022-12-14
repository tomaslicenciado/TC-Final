package tpf;

public class Variable extends ID{

    public Variable(String name, String tipo) {
        super(name, tipo);
    }
    
    public String toString(){
        return ("VARIABLE - "+super.toString());
    }
}
