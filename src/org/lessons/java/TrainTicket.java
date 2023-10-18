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

        // Dichiaro la variabile del carburante
        double fuelPrice = 0.21;

        // Calcolo il prezzo base senza sconti
        double basePrice = Km * fuelPrice;

        // Dichiaro le variabili per gli sconti
        double juniorDiscount = 0.20;
        double seniorDiscount = 0.40;


        // Applico gli sconti in base all'età
        if (Age < 18) {
            basePrice -= basePrice * juniorDiscount;
        } else if (Age >= 65) {
            basePrice -= basePrice * seniorDiscount;
        }

        System.out.println("Il prezzo totale del viaggio è: " + basePrice + " €");

        input.close();
    }
}
