
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num1 = leer.nextInt();

        System.out.print("Ingrese otro numero: ");
        int num2 = leer.nextInt();
        System.out.println("A continuacion ingrese la operacion que desea realizar:");
        System.out.println(" 1- Sumar");
        System.out.println(" 2- Restar");
        System.out.println(" 3- Dividir");
        System.out.println(" 4- Multiplicar");
        operatorias(num1, num2);
    }

    public static void operatorias(int num1, int num2) {
        Scanner leer = new Scanner(System.in);

        int suma = 0;
        int resta = 0;
        int multiplicacion = 0;
        double divicion = 0;
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                suma = num1 + num2;
                System.out.println("El resultado de la suma es :" + suma);
                break;
            case 2:
                resta = num1 - num2;
                System.out.println("El resultado de la resta es :" + resta);
                break;
            case 3:
                divicion = (double) num1 / num2;
                System.out.println("El resultado de la divicion es :" + divicion);
                break;
            case 4:
                multiplicacion = num1 * num2;
                System.out.println("El resultado de la multiplicacion es :" + multiplicacion);
                break;

        }

    }
}
