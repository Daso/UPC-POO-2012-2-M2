
package casoconejo;

public class CasoConejo {

   
    public static void main(String[] args) {
      
       
        
        Ninho alumno1 = new Ninho("Pepe", 5, "Rabito");
        Ninho alumno2 = new Ninho("Sandra", 11, "Motita");
        
     
        
        System.out.println(alumno1.tocarOreja()); 
        System.out.println(alumno2.tocarOreja());
        System.out.println(alumno1.tocarOreja()); 
        System.out.println(alumno2.tocarOreja()); 
    }
}
