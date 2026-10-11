
import java.util.Scanner;

// Activitat 11 — Preu d'una entrada de cinema
// Ajuda: per llegir una lletra amb Scanner
//   char lletra = teclat.next().charAt(0);
public class PreuEntradaCinema {
    public static void main(String[] args) {
        // TODO: l'entrada normal val 5€
        //   Un 10% més en cap de setmana (pregunta L=laborable o C=cap de setmana)
        //   Un 15% de descompte addicional amb Carnet Jove (pregunta S/N)
        //   Mostra el preu final

        Scanner teclat = new Scanner (System.in);
        double preu_entrada = 5.0;
      

        System.out.println(" Laborable o cap de setmana (L/C)");
        char resposta = teclat.next().charAt(0);
        if (resposta == 'C') {
            preu_entrada = preu_entrada * 1.10 ;}

        System.out.println("Tens Carnet Jove? (S/N):");
        char carnet = teclat.next().charAt(0);
        if (carnet == 'S') {
        preu_entrada = preu_entrada * 0.85;}

        System.out.println("preu final: " + preu_entrada + "€");
        teclat.close();






    }
}
