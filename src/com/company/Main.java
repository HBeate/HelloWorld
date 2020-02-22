package com.company;

public class Main {

    public static void main(String[] args) {
        String myEncryptedMessage = "";
        String myOriginalMessage = "";

        String myMessage = "DAS.IST!EINE?GEHEIME;NACHRICHT-!?!";
        System.out.println("\nMeine ursprüngliche Nachricht:  \t\t\t" + myMessage);    // \n -> new line

        for (int i = 0; i < myMessage.length(); i++) {      // liest die Länge der Nachricht ein

            char mychar = myMessage.charAt(i);              // charAt -> liest aus einer Position einen Charakter aus
            switch (mychar) {
                case '!':
                case '?':
                case '.':
                case ',':
                case ';':
                case '-':
                case '(':
                case ')':
                    myEncryptedMessage = myEncryptedMessage + mychar;       //Diese Sonderzeichen werden nicht verschlüsselt
                    break;
                default:
                    mychar += 2;                                    // rutscht im ASCII code um zwei Stellen weiter
                    myEncryptedMessage = myEncryptedMessage + mychar;

            }
        }
        System.out.println("\nMeine verschlüsselte Nachricht: \t\t\t" + myEncryptedMessage);

        for (int i = 0; i < myMessage.length(); i++) {

            char mychar = myEncryptedMessage.charAt(i);
            switch (mychar) {
                case '!':
                case '?':
                case '.':
                case ',':
                case ';':
                case '-':
                case '(':
                case ')':
                    myOriginalMessage = myOriginalMessage + mychar;       //Diese Sonderzeichen werden nicht verschlüsselt
                    break;
                default:
                    mychar -= 2;                                    // rutscht im ASCII code um zwei Stellen weiter
                    myOriginalMessage = myOriginalMessage + mychar;

            }

        }
        System.out.println("\nMeine wieder entschlüsselte Nachricht:  \t" + myOriginalMessage);
    }
}
