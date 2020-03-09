package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VierGewinnt {
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("       Vier Gewinnt");
        System.out.println("*****************************");
        System.out.println("  0   1   2   3   4   5   6  ");

        char[][] field = initializeGameField();
        printGameField(field);
        boolean isPlayerO = true;
        boolean isWinner = false;
        if (isFieldFull(field)) {
            System.out.println("Game over - no one wins!");
        }
        while (true) {

            while (!getUserInputAndSetCoin(field, isPlayerO)) ;
            System.out.println("  0   1   2   3   4   5   6  ");
            printGameField(field);
            isWinner(field);
            isPlayerO = !isPlayerO;
        }
    }

    private static boolean getUserInputAndSetCoin(char[][] field, boolean isPlayerO) {
        // TODO check Error Inputs...
        Scanner input = new Scanner(System.in);


        try {
            int userInput = input.nextInt();
            int row = 0;

            if (field[0][userInput] != ' ') {
                System.out.println("Column " + userInput + " is full. Try it again.");
                return false;
            } else {
                for (int i = 5; i >= 0; i--) {
                    if (field[i][userInput] == ' ') {
                        row = i;
                        if (isPlayerO) {
                            field[row][userInput] = 'O';
                        } else {
                            field[row][userInput] = 'X';
                        }
                        break;

                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Please enter a number from 0 to 6!");
        }
        return true;

    }

    private static boolean isWinner(char[][] field) {


        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                if (field[row][col] == field[row][col + 1] && field[row][col + 2] == field[row][col + 3] && field[row][col] == field[row][col + 3] && field[row][col] != ' ') {
                    System.out.println("There is a winner - ROW");
                    break;
                }
                if (field[row][col] == field[row+1][col] && field[row+2][col] == field[row+3][col] && field[row][col] == field[row+3][col] && field[row][col] != ' ') {
                    System.out.println("There is a winner - COLUMN");
                    break;
                }
                if (field[row][col] == field[row+1][col+1] && field[row+2][col+2] == field[row+3][col+3] && field[row][col] == field[row+3][col+3] && field[row][col] != ' ') {
                    System.out.println("There is a winner - DIAGONAL");
                    break;
                }
            }
        }

        return true;
    }


    private static boolean isFieldFull(char[][] field) {
        for (int row = 0; row < 6; row++) {
            for (int col = 0; col < 7; col++) {
                if (field[row][col] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    private static char[][] initializeGameField() {
        char[][] field = new char[6][7];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                field[i][j] = ' ';

            }


        }
        return field;
    }

    private static void printGameField(char[][] field) {
        for (int i = 0; i < field.length; i++) {

            for (int j = 0; j < field.length + 1; j++) {
                System.out.print("|  " + field[i][j]);
                if (j == 6) {
                    System.out.println("|");
                }
            }


        }

    }
}
