
import java.util.Scanner;

// Activitat 08 — Positiu, negatiu o zero
public class PositiuNegatiuZero {
    public static void main(String[] args) {
         Scanner teclat = new Scanner(System.in);

        int numero;

        System.out.println("Posa un número:");
        numero = teclat.nextInt();

        if (numero > 0) {
            System.out.println("Número positiu");
        } else if (numero < 0) {
            System.out.println("Número negatiu");
        } else {
            System.out.println("Número zero");
        }
    }
}
