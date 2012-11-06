
package babyshower;

public class BabyShower {

    public static void main(String[] args) {
        Asistente asistente1 = new Asistente("Carla", 12, 1, 1982);
        Asistente asistente2 = new Asistente("Sonia", 12, 12,2002);
        
        System.out.println(asistente1.preguntarEdad(asistente2));
        System.out.println(asistente2.preguntarEdad(asistente1));
    }
}
