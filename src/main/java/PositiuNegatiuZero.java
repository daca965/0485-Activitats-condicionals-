
import java.util.Scanner;

// Activitat 08 — Positiu, negatiu o zero
public class PositiuNegatiuZero {
    public static void main(String[] args) {
        // TODO: llegeix un número enter i digues si és positiu, negatiu o zero


        Scanner teclat = new Scanner(System.in);

        int numero;

        System.out.println("posa un numero ");
        numero = teclat.nextInt();

        if (numero > 0) {
            System.out.println("numero positiu");}
        else if (numero < 0){
            System.out.println("numero es negatiu");}
            else {
                System.out.println("numero es zero");}

        
    }
}
