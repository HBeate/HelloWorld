package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String myMessage = "DASISTEINEGEHEIMANACHRICHT";
        System.out.println(myMessage);
        System.out.println();

        for (int i = 0; i < myMessage.length(); i++) {

            char mychar = myMessage.charAt(i); // liest aus einer Position einen Charakter aus
            mychar += 2;
            System.out.print(mychar);
        }
 /*      String[] myMessageArray = myMessage.split("");
       for (String character : myMessageArray){
           character +=2;
           System.out.print(character);

        } */ //Check out CharAt auf der Folie STRINGS
    }
}
