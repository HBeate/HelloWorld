package com.company;

import java.sql.SQLOutput;

public class StringsFromBookp136 {
    public static void main(String[] args) {

        // Aufgabe Buch Seite 143
        System.out.println("\nErsetze alle Umlaute mit (-) und alle anderen Buchstaben mit (.)");
        convertVowels("Taumatawhakatangihangakoauauotamateaturipukakapikimaungahoronukupokaiwhenuakitanatahu");

        // Schwierige Aufgabe Buch Seite 148
        String text1 = "Tischlerei";
        String text2 = "Fischerei";
        findCommonSuffix(text1, text2);
        String result = findCommonSuffix(text1, text2);
        System.out.println("\nFinde das längste gemeinsame Suffix: " + result);

        //Einfache Aufgabe Buch Seite 151
        String speise = "Dinkel und Salat";
        String result2 = hackMealPlan(speise);
        System.out.println("Heute gibt's " + result2);

        //Schwierige Aufgabe Buch Seite 151
        String s1 = "Tischlerei";
        String s2 = "Fische";
        String result3 =  findCommonSubstring(s1, s2);
        System.out.println("Der gemeinsame Substring von " +s1 + " und " + s2 + " ist: " + result3);

        String eingabe = "Iss";
        // Eis
        eingabe = "E" + eingabe.substring(0,2).toLowerCase();
        System.out.println(eingabe);
        //Heiss
        eingabe = "H" + eingabe.toLowerCase() + "s";
        System.out.println(eingabe);
        //Heisser
        eingabe = eingabe + "er";
        System.out.println(eingabe);
        //Hosenschei**er
        eingabe = "Hosensc"+ eingabe.toLowerCase().replaceAll("s", "*");
        System.out.println(eingabe);



    }
        //Einfache Aufgabe Buch Seite 152
    // Iss -> Eis Heiss Heisser Hosenschei**er




    private static String findCommonSubstring(String s1, String s2) {
        String commonSubstring = "";
        for (int i = 0; i <s1.length() ; i++) {
            for (int j = 0; j <s1.length() -i ; j++) {
                String teilString = s1.substring(j,j+i);
            if(s2.contains(teilString)){
                commonSubstring = teilString;
            }
            }
        }return String.valueOf(commonSubstring);

    }


    private static String hackMealPlan(String speise) {
        if (speise != null && speise.startsWith("Dinkel")) {
            if ("Dinkelpfannkuchen".equals(speise)) {
                speise = "Hamburger";
            } else {
                speise = speise.substring("Dinkel".length());
                speise = "Hamburger" + speise;
            }
        }
        if (speise != null && speise.contains("Salat")) {
            speise = speise.replaceAll("Salat", "Pommes");
        }

        return String.valueOf(speise);
    }


    private static String findCommonSuffix(String text1, String text2) {
        String gemeinsamerSuffix = "";
        for (int i = text1.length() - 1; i >= 0; i--) {
            String teilString = text1.substring(i);
            if (text2.endsWith(teilString)) {
                gemeinsamerSuffix = teilString;
            } else {
                break;
            }
        }
        return String.valueOf(gemeinsamerSuffix);
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

        return "";
    }

}





