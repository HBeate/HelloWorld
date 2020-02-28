package com.company;

import java.util.Scanner;

public class StringHelper {

    public static void main(String[] args) {


        //   System.out.println("Is Palindrome:" + isPalindrome("Regallager"));
        String result = countSpecificLetters("Hansi ist nett");
        System.out.println("Der Buchstabe kommt " + result + " mal vor.");

        //   String result = reverseString("Hansi ist nett");
        //   String result = reverseStringVariant2("Hansi ist nett");
        // printAmountOfLetters("Das ist schoen");
    }


    public static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        word = word.toUpperCase();

        char[] lettersOfWord = word.toCharArray();
        int lastIndex = lettersOfWord.length - 1;

        for (int i = 0; i < lettersOfWord.length / 2; i++) {
            if (lettersOfWord[i] != lettersOfWord[lastIndex - i]) {
                return false;
            }
        }
        return true;

    }

    public static String countSpecificLetters(String text) {
        Scanner myLetterScanner = new Scanner(System.in);
        String userInput = myLetterScanner.next();
        text = text.toLowerCase();
        int counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == userInput.charAt(0)) {
                counter++;
            }
        }
        return String.valueOf(counter);
    }

    public static String reverseStringVariant2(String text) {
        char[] letters = text.toCharArray();
        char[] reverseLetters = new char[letters.length];
        int lastIndex = letters.length - 1;
        for (int i = 0; i < letters.length; i++) {
            reverseLetters[i] = letters[lastIndex - i];

        }
        return String.valueOf(reverseLetters);


    }

    public static String reverseString(String text) {
        char[] letters = text.toCharArray();
        int lastIndex = letters.length - 1;
        for (int i = 0; i < letters.length / 2; i++) {
            char temp = letters[i];
            letters[i] = letters[lastIndex - i];
            letters[lastIndex - i] = temp;

        }


        return String.valueOf(letters);
    }

    public static void printAmountOfLetters(String text) {
        char[] letters = text.toCharArray();            //konvertiert den Text in eine Zeichen Array in ASCII
        int[] countLetters = new int[127];              //eine Stelle für jedes Zeichen

        for (int i = 0; i < letters.length; i++) {
            int letter = letters[i];                    //liest ein Zeichen nach dem anderen aus der Array letters
            countLetters[letter] += 1;                   // !! +=1 !! beim Zeichen wird der jeweilige Zähler im Array countLetters erhöht

        }
        for (int i = 0; i < countLetters.length; i++) {
            if (countLetters[i] != 0) {
                System.out.println(Character.toString(i) + " kommt " + countLetters[i] + " mal vor.");
            }
        }

    }
}
