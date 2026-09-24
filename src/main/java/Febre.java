// Activitat 01 — Febre

import java.util.Scanner;

public class Febre {
    public static void main(String[] args) {
        // TODO: llegeix la temperatura (real, per teclat) i digues si hi ha febre
        //   Si temperatura > 37 -> "Tens febre, has d'anar cap a casa a descansar!!"
        //   Si no -> un altre missatge (per exemple, que pot quedar-se)
    

         Scanner teclat = new Scanner(System.in);
         int temperatura;
         System.out.println("la teva temperatura es: ");
         temperatura = teclat.nextInt();
         if(temperatura >=37) {
            System.out.println("has d'anar cap a casa ");
           
          }

          else{ 
           System.out.println("estas be"); 
           }
          
    }
    
 }   
        
