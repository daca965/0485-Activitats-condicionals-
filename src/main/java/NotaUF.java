
import java.util.Scanner;
import java.util.function.DoubleConsumer;

import jdk.jshell.spi.ExecutionControl;

// Activitat 04 — Nota d'una UF (mitjana ponderada)
public class NotaUF {
    public static void main(String[] args) {
        // TODO: llegeix la nota d'activitats i la nota de proves
        //   La nota final = activitats * 0.10 + proves * 0.90
        //   Mostra la nota final i digues si s'ha aprovat (>= 5) o no


        Scanner teclat =  new  Scanner(System.in);

        double nota_activitats;
        System.out.println("nota activitas");
        nota_activitats = teclat.nextDouble();
        double nota_proves;
        System.out.println("nota_proves");
        nota_proves = teclat.nextDouble();

          double nota_final;

           nota_final = nota_activitats * 0.10 + nota_proves * 0.90;


         if(nota_final >=5  ) {
            System.out.println("aproves ");
            }

         else {
            System.out.println("suspens");
            }

    }

}
