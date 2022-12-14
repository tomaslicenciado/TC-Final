package tpf;

public abstract class ID {
    String idName;
    String tipo;
    Boolean inicializado;
    Boolean utilizado;

    public ID(String name, String tipo){
        this.idName=name;
        this.tipo=tipo;
        this.inicializado=false;
        this.utilizado=false;
    }

    public void inicializar(){this.inicializado=true;}

    public void usar(){this.utilizado=true;}

    public String toString(){return "ID: "+idName+", Tipo: "+tipo+", Inicializado: "+(inicializado?"SI":"NO")+", Utilizado: "+(utilizado?"SI":"NO");}
}
