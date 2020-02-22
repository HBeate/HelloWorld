package com.company;

public class Main {

    public static void main(String[] args) {
        String myEncryptedMessage = "";
        String myOriginalMessage = "";
        String myMessageWithoutUmlaute = "";
        String myUmlaute = "";
        String myMessage = "DAS.IST!EINE?GEHEIME;NACHRICHT-!?! Test mit Umlauten: Ö Ä Ü ß. Ich komme aus Österreich";
        for (int i = 0; i < myMessage.length(); i++) {

            char mychar = myMessage.charAt(i);              // charAt -> liest aus einer Position einen Charakter aus
            switch (mychar) {
                case 'Ö':
                    myUmlaute = "OE";
                    myMessageWithoutUmlaute = myMessageWithoutUmlaute + myUmlaute;
                    break;
                case 'Ä':
                    myUmlaute = "AE";
                    myMessageWithoutUmlaute = myMessageWithoutUmlaute + myUmlaute;
                    break;
                case 'Ü':
                    myUmlaute = "UE";
                    myMessageWithoutUmlaute = myMessageWithoutUmlaute + myUmlaute;
                    break;
                case 'ß':
                    myUmlaute = "SS";

                    myMessageWithoutUmlaute = myMessageWithoutUmlaute + myUmlaute;
                    break;
                default:
                    myMessageWithoutUmlaute = myMessageWithoutUmlaute + mychar;
            }
        }
        System.out.println("Meine original Nachricht: \t\t\t\t" + myMessage);
        System.out.println("Meine original Nachricht ohne Umlaute: \t" + myMessageWithoutUmlaute);
        myMessage = myMessageWithoutUmlaute.toUpperCase();

        System.out.println("Meine Nachricht ohne Umlaute & groß:  \t" + myMessage);    // \n -> new line

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
        System.out.println("Meine verschlüsselte Nachricht: \t\t" + myEncryptedMessage);

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
        System.out.println("Meine wieder entschlüsselte Nachricht:  " + myOriginalMessage);
    }
}
