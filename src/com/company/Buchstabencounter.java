package com.company;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Buchstabencounter {

    public static void main(String[] args) {
        String inputText = "Das ist mein Text!";
        char[] textToChar = inputText.toCharArray();
        inputText = inputText.toUpperCase();
        System.out.println(inputText);
        Scanner textScanner = new Scanner(System.in);
        int[] alphabet = new int[127];

        int[] letterCounter = new int[alphabet.length];
        System.out.println("letterCounter Länge; " + letterCounter.length);
        for (int i = 0; i < alphabet.length; i++) {
            char mychar = inputText.charAt(i);
            for (int j = 0; j < alphabet.length; j++) {

            }


            System.out.print(alphabet[i]);
        }

        System.out.println(letterCounter);
    }

}

