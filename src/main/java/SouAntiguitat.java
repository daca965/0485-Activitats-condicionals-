
import java.util.Scanner;
// Activitat 15 — Sou i antiguitat
public class SouAntiguitat {
    public static void main(String[] args) {
        // TODO: llegeix el sou i els anys d'antiguitat
        //   a) sou < 500 i antiguitat >= 10 -> augment del 20%
        //   b) sou < 500 i antiguitat < 10  -> augment del 5%
        //   c) sou >= 500                   -> sense canvis
        //   Mostra el sou a pagar

        Scanner teclat = new Scanner (System.in);

        int sou;
        System.out.println("sou: ");
        sou = teclat.nextInt();

        int antiguitat;
        System.out.println("antiguitat: ");
        antiguitat = teclat.nextInt();

if (sou < 500) {

    if (antiguitat >= 10) {
        System.out.println("Augment del 20%");
        System.out.println("Sou a pagar: " + (sou + sou * 0.20));
     } else {
        System.out.println("Augment del 5%");
        System.out.println("Sou a pagar: " + (sou + sou * 0.05));
     }

     } else {
    System.out.println("No hi ha canvis");
    System.out.println("Sou a pagar: " + sou);
}
    }
}
