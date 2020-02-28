package com.company;

public class CharacterTest {
    public static void main(String[] args) {

        String text = "Das ist ein Text! Aaaah";



        char[] letters = text.toCharArray();
        int[] countLetters = new int[127];

        for (int i = 0; i < letters.length; i++) {
            int letter = letters[i];
            countLetters[letter] += 1;
        }

        for (int i = 0; i < countLetters.length; i++) {
            if(countLetters[i]!=0){
                System.out.println(Character.toString(i) + ":" + countLetters[i]);
            }
        }

    }
}
