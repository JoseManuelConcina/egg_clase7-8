
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
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euro= sc.nextDouble();
        System.out.println("A que quiere cambiar? (Dolares, Yenes o Libras)");
        String respuesta=sc.next();
        cambioMonedas(euro, respuesta);
    }
    
    public static void cambioMonedas( double euros, String tipoMoneda){
    
        switch (tipoMoneda) {
            case "Dolares":
                    System.out.println("El cambio a dolares es: "+ (euros*1.28611));
                break;
                case "Yenes":
                    System.out.println("El cambio a Yenes es: "+ (euros*129.852));
                break;
                case "Libras":
                    System.out.println("El cambio a Libras es: "+ (euros*0.86));
                break;

        }
    
    }
    
    
}
