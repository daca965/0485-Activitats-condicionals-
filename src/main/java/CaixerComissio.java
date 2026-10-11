// Activitat 10 — Caixer, comissió i saldo

import java.util.Scanner;

public class CaixerComissio {
    public static void main(String[] args) {
        // TODO: llegeix el saldo actual, la quantitat a treure i si fas servir caixer propi (S/N)
        //   Si NO és caixer propi, aplica una comissió del 5% sobre la quantitat
        //   Si (quantitat + comissió) > saldo -> "No es pot fer la retirada. Saldo insuficient."
        //   Si no, mostra la quantitat, la comissió (si n'hi ha) i el saldo restant


       Scanner teclat = new Scanner(System.in);

       double saldo;
       System.out.println("saldo actual:");
       saldo = teclat.nextDouble();

       double quantitat;
       System.out.println("quantitat a treure:");
       quantitat = teclat.nextDouble();

       
       System.out.println("fas servir caixer propi: (S/N)");
       char caixerPropi  = teclat.next().charAt(0);
        
       double comissio = 0;
      
        if (caixerPropi == 'N') {
            comissio = quantitat * 0.05;
            }

            double quantitatRetirar = quantitat + comissio;

        if (quantitatRetirar > saldo) {
            System.out.println("No es pot fer la retirada. Saldo insuficient.");
            }
        else {
             saldo = saldo - quantitatRetirar ;
             System.out.println("Et queden " + saldo + "euros");
             if(comissio>0)
                System.out.println("comissio" + comissio);
            System.out.println("Quantitat a treure" + quantitatRetirar );
            }


    }
}
