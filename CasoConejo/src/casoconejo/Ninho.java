package casoconejo;

public class Ninho {

    private String nombre;
    private int edad;
    private Conejo conejo;

    public Ninho(String nombre, int edad, String nombreConejo) {
        this.nombre = nombre;
        this.edad = edad;
        this.conejo = new Conejo(nombreConejo);
    }

    public Conejo getConejo() {
        return conejo;
    }

    public void setConejo(Conejo conejo) {
        this.conejo = conejo;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String tocarOreja() {

        return "Soy " + nombre + " y toco la oreja a "
                + conejo.getNombre() + " que dice: " + conejo.moverCola();
    }

    public String mostrarZanahoria() {
        return conejo.acercarse();
    }
}
