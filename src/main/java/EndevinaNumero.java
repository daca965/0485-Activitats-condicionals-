import java.util.Random;
import java.util.Scanner;
// Activitat 18 — Endevina el número
// Ajuda: java.util.Random -> random.nextInt(10) + 1  (número entre 1 i 10)
public class EndevinaNumero {
    public static void main(String[] args) {
        // TODO: genera un número aleatori entre 1 i 10
        //   Demana a l'usuari que l'endevini
        //   Si l'encerta, felicita'l; si no, digues quin número era

        Scanner teclat = new Scanner(System.in);
        Random generadorAleatoris = new Random();
        
        int numeroAleatori = generadorAleatoris.nextInt(10) + 1;

        System.out.println("Introdueix un número entre 1 i 10:");
        int numeroUsuari = teclat.nextInt();

        if (numeroUsuari == numeroAleatori) {
            System.out.println("Felicitats! L'has encertat.");
        } else {
            System.out.println("No l'has encertat.");
            System.out.println("El número era: " + numeroAleatori);
        }
    }
}
      

        


