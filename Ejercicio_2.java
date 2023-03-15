
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anabela
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       personas();
    }
    
      public static void personas(){
         Scanner leer= new Scanner(System.in);
         String respuesta= "";
         
        do {
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese la edad de la persona");
            int edad = leer.nextInt();
            if (edad>=18) {
                System.out.println("Es mayor");
            } else {
                System.out.println("Es menor");
            }   
            System.out.println("Quiere agregar otra persona?");
            
            respuesta = leer.next();
           
        } while (!respuesta.equalsIgnoreCase("no"));
        
        
        
        
        
        
    }
    
}

