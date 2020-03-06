package com.company;

import javax.swing.*;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        char[][] field = initializeField();
        printField(field);

        boolean isPlayerO = true;
        while (true) {
            if (isPlayerO) {
                System.out.println("Enter your choice Player (O)");
            } else {
                System.out.println("Enter your choice Player (X)");
            }
            Scanner input = new Scanner(System.in);
            try {
                String userInput = input.next();
                String[] in = userInput.split(",");
                int x = Integer.parseInt(in[0]);
                int y = Integer.parseInt(in[1]);

                if (isPlayerO && (field[x][y] == ' ')) {
                    field[x][y] = 'O';
                } else if ((field[x][y] == ' ')) {
                    field[x][y] = 'X';
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("Bitte Format \'Zahl,Zahl\' einhalten.");
            }
            isPlayerO = isPlayerO ? false : true;
            printField(field);
            if (isGameOver(field)) {
                System.out.println("We have a winner!");

            }
        }
    }

    private static boolean isGameOver(char[][] field) {
        int[] counterXColumns = new int[3];
        int[] counterOColumns = new int[3];
        int diagCounterX = 0;
        int diagCounterX2 = 0;
        int diagCounterO = 0;
        int diagCounterO2 = 0;

        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == 'X') {
                counterXColumns[0]++;
            }
            if (field[i][1] == 'X') {
                counterXColumns[1]++;
            }
            if (field[i][2] == 'X') {
                counterXColumns[2]++;
            }
            int counterXRows = 0;
            int counterORows = 0;

            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == 'X') {
                    counterXRows++;
                } else if (field[i][j] == 'O') {
                    counterORows++;
                }
// count diagonal Xs or Os from top left to bottom right
                if (i == j && field[i][j] == 'X') {
                    diagCounterX++;
                } else if (i == j && field[i][j] == 'O') {
                    diagCounterO++;
                }
            }
            if (field[i][2 - i] == 'X') {
                diagCounterX2++;
            } else if (field[i][2 - i] == 'O') {
                diagCounterO2++;
            }

            if (counterXRows == 3 || diagCounterX == 3 || diagCounterX2 == 3) {
                System.out.println("X won!!!!!!");
            } else if (counterORows == 3 || diagCounterO == 3 || diagCounterO2 == 3) {
                System.out.println("O won!!!!!");
            }

            //         } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2 - i][i] != ' ') {
        }
        if (counterXColumns[0] == 3) {
            System.out.println("X won in column 0");
        }
        if (counterXColumns[1] == 3) {
            System.out.println("X won in column 1");
        }
        if (counterXColumns[2] == 3) {
            System.out.println("X won in column 2");
        }
        if (counterOColumns[0] == 3) {
            System.out.println("X won in column 0");
        }
        if (counterOColumns[1] == 3) {
            System.out.println("X won in column 1");
        }
        if (counterOColumns[2] == 3) {
            System.out.println("X won in column 2");
        }
        /*for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != ' ') {
                return true;
            } else if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != ' ') {
                return true;
            } else if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[i][i] != ' ') {
                return true;
            } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2 - i][i] != ' ') {
                return true;
            }
            for (int j = 0; j < 3; j++) {
                if(field[i][j] != ' '){
                    System.out.println("Alle Felder besetzt");
                }
            }

        } */
        return false;
    }


    private static char[][] initializeField() {
        char[][] field = new char[3][3];
        field[0][0] = ' ';
        field[0][1] = ' ';
        field[0][2] = ' ';
        field[1][0] = ' ';
        field[1][1] = ' ';
        field[1][2] = ' ';
        field[2][0] = ' ';
        field[2][1] = ' ';
        field[2][2] = ' ';

        return field;

    }

    private static void printField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print("|" + field[i][j]);
                if (j == 2) {
                    System.out.println("|");
                }
            }
        }
    }
}