// Activitat 24 — Signes del zodíac (switch)

import java.util.Scanner;

public class SignesZodiac {
    public static void main(String[] args) {
        // TODO:
        //   a) Mostra el llistat dels 12 signes amb el seu número
        //   b) Demana un número per teclat
        //   c) Amb un switch, mostra la categoria (Foc, Terra, Aire o Aigua)
        //   Si el número no correspon a cap signe: "ERROR: <número> no associat a cap signe."

        Scanner lector = new Scanner (System.in);
        System.out.println("1. Aries");
        System.out.println("2. Tauro");
        System.out.println("3. Géminis");
        System.out.println("4. Cáncer");
        System.out.println("5. Leo");
        System.out.println("6. Virgo");
        System.out.println("7. Libra");
        System.out.println("8. Escorpio");
        System.out.println("9. Sagitario");
        System.out.println("10. Capricornio");
        System.out.println("11. Acuario");
        System.out.println("12. Piscis");
    
        System.out.println("Entra número el signe del zodiac [1-12]");
        
        int signes_del_Zodíac = lector.nextInt();
        switch(signes_del_Zodíac){

     case 1: case 5: case 9:
        System.out.println("Foc");
        break;

     case 2: case 6: case 10:
        System.out.println("Terra");
        break;

     case 3: case 7: case 11:
        System.out.println("Aire");
        break;

     case 4: case 8: case 12:
        System.out.println("Aigua");
        break;

     default:
        System.out.println("ERROR: " + signes_del_Zodíac + " no associat a cap signe.");
}
      
    }
}
