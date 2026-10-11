// Activitat 14 — Entre 1 i 10 i parell (if-else aniuada)

import java.util.Scanner;

public class EntreU10Parell {
    public static void main(String[] args) {
        // TODO amb if-else aniuada: llegeix un número enter
        //   Digues si està entre 1 i 10 I, a més, si és parell

        Scanner teclat = new Scanner(System.in);

        int numero;
        System.out.println("posa un numero :");
        numero = teclat.nextInt();

        if (numero <= 10 ) {
             if (numero % 2 == 0) {
                System.out.println("El numero esta entre 1 i 10 i es parell");
            } 
            else {
                System.out.println("El numero esta entre 1 i 10 pero no es parell");
            }

        } else {
            System.out.println("El numero no esta entre 1 i 10");
        }
    }
}

