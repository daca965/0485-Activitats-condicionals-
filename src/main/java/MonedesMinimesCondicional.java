// Activitat 27 — Monedes mínimes

import java.util.Scanner;

public class MonedesMinimesCondicional {
    public static void main(String[] args) {
        // TODO: llegeix una quantitat en cèntims (comprova que sigui >= 0)
        //   Mostra la quantitat mínima de monedes de 1, 2, 5, 10, 20, 50, 100 i 200 cèntims
        //   Només mostra les línies amb quantitat > 0


        Scanner teclat = new Scanner(System.in);

        System.out.print("Introdueix una quantitat en cèntims: ");
        int centims = teclat.nextInt();

        if (centims >= 0) {
            int monedes;

            // Moneda de 200 cèntims
            monedes = centims / 200;
            if (monedes > 0) {
                System.out.println("200c: " + monedes);
            }
            centims = centims % 200;

            // Moneda de 100 cèntims
            monedes = centims / 100;
            if (monedes > 0) {
                System.out.println("100c: " + monedes);
            }
            centims = centims % 100;

            // Moneda de 50 cèntims
            monedes = centims / 50;
            if (monedes > 0) {
                System.out.println("50c: " + monedes);
            }
            centims = centims % 50;

            // Moneda de 20 cèntims
            monedes = centims / 20;
            if (monedes > 0) {
                System.out.println("20c: " + monedes);
            }
            centims = centims % 20;

            // Moneda de 10 cèntims
            monedes = centims / 10;
            if (monedes > 0) {
                System.out.println("10c: " + monedes);
            }
            centims = centims % 10;

            // Moneda de 5 cèntims
            monedes = centims / 5;
            if (monedes > 0) {
                System.out.println("5c: " + monedes);
            }
            centims = centims % 5;

            // Moneda de 2 cèntims
            monedes = centims / 2;
            if (monedes > 0) {
                System.out.println("2c: " + monedes);
            }
            centims = centims % 2;

            // Moneda de 1 cèntim
            if (centims > 0) {
                System.out.println("1c: " + centims);
            }

        } else {
            System.out.println("Quantitat no vàlida");
        }

        teclat.close();
    }
}

    
