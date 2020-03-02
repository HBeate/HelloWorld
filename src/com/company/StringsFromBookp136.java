package com.company;

import java.util.Arrays;

public class StringsFromBookp136 {
    public static void main(String[] args) {

        // Aufgabe Buch Seite 143
        convertVowels("Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu");

        // Aufgabe Buch Seite
        //    ->>  CONTINUE ON PAGE 145 !!!!



    }

    public static String convertVowels(String mountainNewZealand) {
        System.out.println(mountainNewZealand);
        mountainNewZealand.toLowerCase();
        for (int i = 0; i < mountainNewZealand.length(); i++) {
            char letters = mountainNewZealand.charAt(i);
            switch (letters) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.print("-");
                    break;
                default:
                    System.out.print(".");
            }


        }

    return  "";}
}



