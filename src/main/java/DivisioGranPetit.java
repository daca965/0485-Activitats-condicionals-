
import java.util.Scanner;

// Activitat 07 — Dividir el més gran entre el més petit
public class DivisioGranPetit {
    public static void main(String[] args) {
        // TODO: llegeix 2 números diferents
        //   Si són iguals -> "Els números han de ser diferents"
        //   Troba el més gran i el més petit
        //   Si el més petit és 0 -> "El divisor no pot ser 0"
        //   Si no, mostra el resultat de dividir el gran entre el petit

       Scanner teclat = new Scanner(System.in);

        double numero1;
        System.out.println("numero 1");
        numero1 = teclat.nextDouble();

        double numero2;
        System.out.println("numero 2");
        numero2 = teclat.nextDouble();

        if (numero1 == numero2) {
            System.out.println("Els números han de ser diferents");
        } 
        else {

            double gran;
            double petit;

            if (numero1 > numero2) {
                gran = numero1;
                petit = numero2;
            } 
            else {
                gran = numero2;
                petit = numero1;
            }

            if (petit == 0) {
                System.out.println("El divisor no pot ser 0");
            } 
            else {
                double resultat = gran / petit;
                System.out.println("Resultat: " + resultat);
            }
        }
    }
}




        

        



