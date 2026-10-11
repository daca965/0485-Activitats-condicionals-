import java.util.Random;
import java.util.Scanner;

// Activitat 21 — Pedra, paper o tisora
// Ajuda: java.util.Random -> random.nextInt(3)  (0 pedra, 1 paper, 2 tisora)
public class PedraPaperTisora {
    public static void main(String[] args) {
        // TODO: l'ordinador tria a l'atzar pedra, paper o tisora
        //   L'usuari entra la seva opció per teclat
        //   Mostra què ha tret l'ordinador i qui guanya (tisores>paper>pedra>tisores)

       Scanner teclat = new Scanner(System.in);
        Random random = new Random();

        int ordinador = random.nextInt(3);

        System.out.println("0 = Pedra");
        System.out.println("1 = Paper");
        System.out.println("2 = Tisora");

        int usuari = teclat.nextInt();

        if (ordinador == 0) {
            System.out.println("Ordinador: Pedra");
        } else if (ordinador == 1) {
            System.out.println("Ordinador: Paper");
        } else {
            System.out.println("Ordinador: Tisora");
        }

        if (usuari == ordinador) {
            System.out.println("Empat");
        } else if (usuari == 0 && ordinador == 2) {
            System.out.println("Guanyes tu");
        } else if (usuari == 1 && ordinador == 0) {
            System.out.println("Guanyes tu");
        } else if (usuari == 2 && ordinador == 1) {
            System.out.println("Guanyes tu");
        } else {
            System.out.println("Guanya l'ordinador");
        }
    }
}


    
