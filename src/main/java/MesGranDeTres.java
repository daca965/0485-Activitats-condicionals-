
import java.util.Scanner;

// Activitat 12 — El més gran de tres números
public class MesGranDeTres {
    public static void main(String[] args) {
        // TODO: llegeix 3 números i mostra quin és el més gran

        Scanner teclat = new Scanner(System.in);

        double num1 = 0;
        System.out.println("posa el numero 1");
        num1 = teclat.nextDouble();
        double num2 = 0;
        System.out.println("posa el nnumero 2");
        num2 = teclat.nextDouble();
        double num3 = 0;
        System.out.println("posa el numero 3");
        num3 = teclat.nextDouble();
       

        double major = num1;

     if (num2 > major) {
     major = num2;
     }

     if (num3 > major) {
     major = num3;
     }

     System.out.println("El numero més gran és: " + major);

    }
}
