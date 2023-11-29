package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        // DICHIARO LE VARIABILI
        String name;
        String surname;
        String favoriteColor;
        int yearOfBirth;
        int monthOfBirth;
        int dayOfBirth;
        int sumOfDayMonthYear;

        String password;

        Scanner inputPasswordInformation = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        name = inputPasswordInformation.next();
        System.out.println("Inserisci il tuo cognome");
        surname = inputPasswordInformation.next();
        System.out.println("Inserisci il tuo colore preferito");
        favoriteColor = inputPasswordInformation.next();
        System.out.println("Inserisci il tuo anno di nascita");
        yearOfBirth = inputPasswordInformation.nextInt();
        do {
            System.out.println("Inserisci il tuo mese di nascita");
            monthOfBirth = inputPasswordInformation.nextInt();
        }
        while (monthOfBirth < 1 || monthOfBirth > 12);
        System.out.println("Inserisci il tuo giorno di nascita");
        dayOfBirth = inputPasswordInformation.nextInt();
        System.out.println("I tuoi dati:" + " " + name + " " + surname + " " + favoriteColor + " " + "nato il: " + dayOfBirth + "/" + monthOfBirth + "/" + yearOfBirth);

        sumOfDayMonthYear = yearOfBirth + monthOfBirth + dayOfBirth;
        password = name + "-" + surname + "-" + favoriteColor + "-" + sumOfDayMonthYear;
        System.out.print(password);
    }
}
