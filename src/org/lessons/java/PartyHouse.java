package org.lessons.java;

import java.util.Scanner;
public class PartyHouse {
    public static void main(String[] args) {

        // Inizializzo l'array con i nomi
        String[] guestList = {
                "Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };

        // Richiedo il nome all'utente
        Scanner input = new Scanner(System.in);
        System.out.print("Scrivi il tuo nome: ");
        String userName = input.nextLine();

        // Verifico se il nome è presente nella lista o meno con metodo for
        /*boolean invited = false;
        for (int i = 0; i < guestList.length; i++) {
            if (userName.equals(guestList[i])) {
                invited = true;
                break;
            }
        }*/

        // Verifico se il nome è presente nella lista o meno con metodo while
        boolean invited = false;
        int i = 0;
        while (i < guestList.length) {
            if (userName.equals(guestList[i])) {
                invited = true;
                break;
            }
            i++;
        }

        if (invited) {
            System.out.println("Benvenut* " + userName + ", Puoi entrare.");
        } else {
            System.out.println("Mi dispiace " + userName + ", ma non puoi entrare.");
        }

        // Chiudo lo Scanner
        input.close();
    }

}
