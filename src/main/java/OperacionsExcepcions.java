
import java.util.InputMismatchException;
import java.util.Scanner;
// Activitat 25 — Operacions aritmètiques amb control d'excepcions
public class OperacionsExcepcions {
    public static void main(String[] args) {
        // TODO: llegeix 2 números enters i mostra suma, resta, multiplicació i divisió
        //   Controla amb try/catch que l'usuari introdueixi números vàlids
        //   Controla que el segon operand no sigui 0 abans de dividir
   try {
            Scanner teclat = new Scanner(System.in);

            System.out.println("Entra el primer numero:");
            int numero1 = teclat.nextInt();

            System.out.println("Entra el segon numero:");
            int numero2 = teclat.nextInt();

            int resultat;

            resultat = numero1 + numero2;
            System.out.println("suma= "+numero1 + " + " + numero2 + " = " + resultat);

            resultat = numero1 - numero2;
            System.out.println("resta= "+numero1 + " - " + numero2 + " = " + resultat);

            resultat = numero1 * numero2;
            System.out.println("multiplicació= "+numero1 + " * " + numero2 + " = " + resultat);

            if (numero2 != 0) {
                resultat = numero1 / numero2;
                System.out.println("divisió= "+numero1 + " / " + numero2 + " = " + resultat);
            } else {
                System.out.println("No es pot dividir per zero");
            }

            teclat.close();

        } catch (InputMismatchException e) {
            System.out.println("Error: has d'introduir números enters");
        }
    }
}
