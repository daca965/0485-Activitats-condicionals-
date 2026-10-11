
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

        
        System.out.println("Entra el primer numero ");
        int numero1 = teclat.nextInt();

        
        System.out.println("Entre el segon numero ");
        int numero2 = teclat.nextInt();

        if (numero1 == numero2) {
            System.out.println("Els numeros son iguals");
        } 
        else {
            if (numero1 > numero2) {
                if (numero2!=0){
                int resultat = numero1/numero2;
                System.out.println("El resultat és " + resultat);

                }
                else{
                    System.out.println("divisor és zero");
                 }
             }
            else{
                 if (numero1!=0){
                int resultat = numero2/numero1;
                System.out.println("El resultat és " + resultat);

                 }
                else{
                    System.out.println("divisor és zero");
                }
            }
        }
    }
}




        

        



