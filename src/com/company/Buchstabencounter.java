package com.company;

public class Buchstabencounter {
    public static void main(String[] args) {

        int counter = 0;
        int counterLetter= 0;
        String myText = "Das ist mein Text und ich sollte herausfinden wieviele Buchstaben darin enthalten sind.\n";
        myText = myText.toUpperCase();
        System.out.println(myText);


        for (int i = 0; i < myText.length(); i++) {
            counter++;                                  //Zählt Zeichen im gesamten Text
            char mychar = myText.charAt(i);
            switch (mychar) {
                case 'E':
                    counterLetter++;
                    break;
                case 'F':
                    counterLetter++;
                    break;
            }
        }System.out.println("Es gibt " + counterLetter + " E." );
        System.out.println("Der Text ist " + counter + " Zeichen lang."); System.out.println(counterLetter);

    }
}
