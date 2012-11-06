
package casoconejo;


public class Conejo {
    private String nombre;

    public Conejo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String moverCola() {
        return "Estoy moviendo la colita";
    }
    
    public String acercarse(){
        return "Me estoy acercando";
    }
    
}
