// Activitat 26 — Positiu, negatiu o zero, amb control d'excepcions

import java.util.InputMismatchException;
import java.util.Scanner;

public class PositiuNegatiuZeroExcepcions {
    public static void main(String[] args) {
        // TODO: com l'activitat 08, però controla amb try/catch que l'usuari
        //   introdueixi un número enter vàlid

           Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Introdueix un número enter: ");
            int num = sc.nextInt();

            if (num > 0) {
                System.out.println("És positiu.");
            } else if (num < 0) {
                System.out.println("És negatiu.");
            } else {
                System.out.println("És zero.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: has d'introduir un número enter vàlid.");
            sc.nextLine(); 
        }

        
    }
}
        
  
