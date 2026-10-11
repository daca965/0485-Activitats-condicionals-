// Activitat 19 — Aposta A o B
// Ajuda: java.util.Random -> random.nextInt(10) + 1

import java.util.Random;
import java.util.Scanner;

public class ApostaAB {
    public static void main(String[] args) {
        // TODO: genera dos números aleatoris A i B (no els mostris encara)
        //   Pregunta per qui aposta l'usuari (A o B); guanya el número més alt
        //   Mostra els dos valors i si ha guanyat o perdut l'aposta

        Scanner teclat = new Scanner(System.in);
        Random generador = new Random();

      
        int A = generador.nextInt(10) + 1;
        int B = generador.nextInt(10) + 1;

     
        System.out.print("Per qui apostes? (A o B): ");
        String aposta = teclat.next();

     
        System.out.println("A = " + A);
        System.out.println("B = " + B);

    
        if (A > B && aposta.equalsIgnoreCase("A")) {
            System.out.println("Has guanyat l'aposta!");
        } else if (B > A && aposta.equalsIgnoreCase("B")) {
            System.out.println("Has guanyat l'aposta!");
        } else {
            System.out.println("Has perdut l'aposta!");
        }

        teclat.close();
    }
}
