
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
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print(" Ingrese un numero : ");
        int numero = leer.nextInt();
      
        solucion(numero);
    }

    public static void solucion(int numero) {
        int contador = 0;
        boolean bandera = true;

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                contador++;
            }

        }
      
        if (contador < 3) {
            System.out.println("Escribir "+bandera);
        } else {
            bandera=false;
            System.out.println("Escribir " + bandera);
        }
    }
}
