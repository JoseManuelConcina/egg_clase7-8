
import java.util.Scanner;

public class EjerManosalaObra_12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros: ");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
       
        
        if (EsMultiplo(num1, num2)) {

            System.out.println("El primer numero es mutiplo del seguno");
        } else {
            System.out.println("El numero no es multiplo");
        }
    }

    public static boolean EsMultiplo(int num1, int num2) {

      
        return (num1 % num2 == 0);

    }
}
