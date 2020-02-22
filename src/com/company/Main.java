package com.company;

public class Main {

    public static void main(String[] args) {
        String myNewMessage = "";
        String myOldMessage = "";
        String myMessage = "DASISTEINEGEHEIMENACHRICHT";
        System.out.println("\n Meine ursprüngliche Nachricht: " + myMessage);    // \n -> new line

        for (int i = 0; i < myMessage.length(); i++) {      // liest die Länge der Nachricht ein

            char mychar = myMessage.charAt(i);              // charAt -> liest aus einer Position einen Charakter aus
            mychar += 2;                                    // rutscht im ASCII code um zwei Stellen weiter
            myNewMessage = myNewMessage + mychar;
        }
        System.out.println("Meine verschlüsselte Nachricht: "+ myNewMessage);

        for (int i = 0; i < myMessage.length(); i++) {

            char mychar = myNewMessage.charAt(i);
            mychar -= 2;                                    // rutscht im ASCII code um zwei Stellen zurück
            myOldMessage = myOldMessage + mychar;


        }
        System.out.println("\n Meine wieder entschlüsselte Nachricht: " + myOldMessage);
    }
}
