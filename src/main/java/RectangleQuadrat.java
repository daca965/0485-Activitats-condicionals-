
import java.util.Scanner;

// Activitat 06 — Rectangle o quadrat
public class RectangleQuadrat {
    public static void main(String[] args) {
        // TODO: llegeix el costat gran i el costat petit d'un rectangle
        //   Mostra el perímetre (costatGran*2 + costatPetit*2) i l'àrea (costatGran*costatPetit)
        //   Digues si és un quadrat (els dos costats iguals) o no

        Scanner teclat = new Scanner(System.in);

        double costat_gran;
        System.out.println("Costat gran:");
        costat_gran = teclat.nextDouble();

        double costat_petit;
        System.out.println("Costat petit:");
        costat_petit = teclat.nextDouble();

        double perimetre;
        perimetre = costat_gran * 2 + costat_petit * 2;

        double area;
        area = costat_gran * costat_petit;

        System.out.println("Perímetre: " + perimetre);
        System.out.println("Àrea: " + area);

        if (costat_gran == costat_petit) {
            System.out.println("És un quadrat");
        } else {
            System.out.println("No és un quadrat");
        }
    }
}
