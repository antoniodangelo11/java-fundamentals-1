package org.lessons.java;

import java.util.Scanner;
public class TrainTicket {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        // Chiedo all'utente il numero di chilometri da percorrere
        System.out.print("Inserisci il numero di chilometri da percorrere: ");
        double Km = input.nextDouble();

        // Chiedo all'utente l'età del passeggero
        System.out.print("Inserisci l'età del passeggero: ");
        int Age = input.nextInt();

        // Calcolo il prezzo base senza sconti
        double basePrice = Km * 0.21;

        // Applico gli sconti in base all'età
        if (Age < 18) {
            basePrice -= basePrice * 0.20;
        } else if (Age >= 65) {
            basePrice -= basePrice * 0.40;
        }

        System.out.println("Il prezzo totale del viaggio è: " + basePrice + " €");

        input.close();
    }
}
