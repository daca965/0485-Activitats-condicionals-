
import java.util.Scanner;

// Activitat 03 — Vaques i porcs
public class VaquesPorcs {
    public static void main(String[] args) {
        // TODO: llegeix el número de vaques i de porcs
        //   Calcula el percentatge de cada un sobre el total i mostra'ls
        //   Digues quin dels dos percentatges és més gran (o si empaten)

      
        Scanner teclat = new Scanner(System.in);
        //numero de vaques 
        double vaques;
        System.out.println("Vaques:");
        vaques = teclat.nextDouble();

        // numero de porcs
        double porcs;
        System.out.println("Porcs:");
        porcs = teclat.nextDouble();

       
        double total;
        total = vaques + porcs;

        //percentatge
        double percentatge_vaques = (vaques * 100.0) / total;
        double percentatge_porcs = (porcs * 100.0) / total;

        System.out.println("Percentatge de vaques: " + percentatge_vaques + "%");
        System.out.println("Percentatge de porcs: " + percentatge_porcs + "%");

        // Compara els percentatges
        if (percentatge_vaques > percentatge_porcs) {
            System.out.println("Hi ha més vaques.");
        } else if (percentatge_vaques < percentatge_porcs) {
            System.out.println("Hi ha més porcs.");
        } else {
            System.out.println("Hi ha el mateix nombre de vaques que de porcs.");
        }
    }
}













