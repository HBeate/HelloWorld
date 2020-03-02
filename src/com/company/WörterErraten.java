package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.Random;
import java.util.Scanner;

public class WörterErraten {
    public static void main(String[] args) {
        System.out.println("\nWÖRTER ERRATEN\nTippe einen Buchstaben oder das ganze Lösungswort. \nDu hast so viele Versuche wie das Wort Buchstaben hat.\n");

        Scanner scan = new Scanner(System.in);

        String[] wordsToGuess = new String[18];
        wordsToGuess[0] = "Trinkschokolade";
        wordsToGuess[1] = "Orangensaft";
        wordsToGuess[2] = "Weisswein";
        wordsToGuess[3] = "Cappuccino";
        wordsToGuess[4] = "Rotwein";
        wordsToGuess[5] = "Saurer Radler";
        wordsToGuess[6] = "Süsser Radler";
        wordsToGuess[7] = "Limonade";
        wordsToGuess[8] = "Tee";
        wordsToGuess[9] = "Apfelsaft";
        wordsToGuess[10] = "Most";
        wordsToGuess[11] = "Süssmost";
        wordsToGuess[12] = "Kaffee";
        wordsToGuess[13] = "Bier";
        wordsToGuess[14] = "Traubensaft";
        wordsToGuess[15] = "Schnaps";
        wordsToGuess[16] = "Likör";
        wordsToGuess[17] = "Cocktail";


        Random random = new Random();
        int randomWordNumber = random.nextInt(wordsToGuess.length - 1);                   //Wählt random von der Array
        String wordToGuess = wordsToGuess[randomWordNumber];
        String mySuperstarString = "";
        for (int i = 0; i < wordToGuess.length(); i++) {
            String mySingleLetter = wordToGuess.substring(i, i + 1);

            if (mySingleLetter.isEmpty() || mySingleLetter.isBlank()) {
                mySuperstarString = mySuperstarString + " ";
            } else {
                mySuperstarString = mySuperstarString + "*";
            }
        }
        System.out.println(mySuperstarString);
        for (int i = 0; i < wordToGuess.length(); i++) {            // Spieler hat so viele Versuche wie das Wort lang ist
            String guessingResults = "";
            String userInput = scan.nextLine();
            if ((wordToGuess.equalsIgnoreCase(userInput))) {
                mySuperstarString = wordToGuess;
                System.out.println(mySuperstarString + " ***Well done!!! ***");
                break;
            } else {
                for (int j = 0; j < wordToGuess.length(); j++) {
                    String tempString = wordToGuess.substring(j, j + 1);
                    if (tempString.equalsIgnoreCase(userInput)) {
                        guessingResults = guessingResults + tempString;
                    } else {
                        guessingResults = guessingResults + mySuperstarString.substring(j, j + 1);
                    }
                }
                mySuperstarString = guessingResults;
                if (mySuperstarString.equals(wordToGuess)) {
                    System.out.println(mySuperstarString + " ***Well done!!! ***");

                } else {
                    System.out.println(mySuperstarString);
                }
            }

        }System.out.println("Game over");
    }
}

