package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        // Inizializzo lo Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il tuo nome: ");
        String name = input.nextLine();

        System.out.print("Inserisci il tuo cognome: ");
        String surname = input.nextLine();

        System.out.print("Inserisci il tuo colore preferito: ");
        String favoriteColor = input.nextLine();

        System.out.print("Inserisci la tua data di nascita (formato: dd/mm/yyyy): ");
        String dateOfBirth = input.nextLine();

        // Divido la data di nascita in giorno, mese e anno
        String[] formatDate = dateOfBirth.split("/");
        int day = Integer.parseInt(formatDate[0]);
        int month = Integer.parseInt(formatDate[1]);
        int year = Integer.parseInt(formatDate[2]);

        // Calcolo la somma di giorno, mese e anno di nascita
        int sumDate = day + month + year;

        // Genero la password
        String password = name + "-" + surname + "-" + favoriteColor + "-" + sumDate;
        System.out.println("La tua password è: " + password);

        input.close();
    }
}
