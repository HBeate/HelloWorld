package com.company;

public class AufgabenVomBuch {
    public static void main(String[] args) {
        //Einfache Aufgabe Buch Seite 95
        char zeichen = 'B';
        System.out.println("Buchstabe: " + Character.isLetter(zeichen));
        System.out.println("Großbuchstabe: " + Character.isUpperCase(zeichen));

        //Einfache Aufgabe Buch S. 103

        int inputNumber = 39;
        if (inputNumber > 0) {

            if (inputNumber % 7 == 0 || inputNumber%13 != 0) {
                System.out.println("Glück gehabt");
            } /*else  if (inputNumber %13 != 0) {
                System.out.println("Glück gehabt");
            }*/else {
                System.out.println("Pech gehabt!");
            }
        } else {
            System.err.println("Keine Zahl übergeben");
        }
    }
}