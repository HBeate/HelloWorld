package com.company;

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

            if (field[0][userInput] != ' ' || userInput > 6) {
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
            isPlayerO = !isPlayerO;
            return false;
        }
        return true;
    }

    private static boolean isWinner(char[][] field) {

//Search rows
        for (int row = 0; row < field.length; row++) {
            int rowCountO = 0;
            int rowCountX = 0;
            for (int col = 0; col < field[row].length; col++) {
                if (field[row][col] == 'O') {
                    rowCountO++;
                } else {
                    rowCountO = 0;
                }

                if (rowCountO == 4) {
                    System.out.println("yay - rowsO");
                }
                if (field[row][col] == 'X') {
                    rowCountX++;
                } else {
                    rowCountX = 0;
                }

                if (rowCountX == 4) {
                    System.out.println("yay - rowsX");
                }
            }
        }
//Search columns
        for (int col = 0; col < field.length; col++) {
            int colCountO = 0;
            int colCountX = 0;
            for (int row = 0; row < field.length; row++) {
                if (field[row][col] == 'O') {
                    colCountO++;
                } else {
                    colCountO = 0;
                }

                if (colCountO == 4) {
                    System.out.println("yay - columnsO");
                }
                if (field[row][col] == 'X') {
                    colCountX++;
                } else {
                    colCountX = 0;
                }

                if (colCountX == 4) {
                    System.out.println("yay - columnsX");
                }
            }
        }

//search diagonal field[i][i] -> 00 - 11 - 22 - 33 - 44 - 55

        for (int i = 0; i < field.length; i++) {
            int diagCountO = 0;
            int diagCountX = 0;
            if (field[i][i] == 'O') {
                diagCountO++;

            } else {
                diagCountO = 0;
            }
            if (diagCountO == 4) {
                System.out.println("yay - diagCountO [i][i]");
            }
            if (field[i][i] == 'X') {
                diagCountX++;
            } else {
                diagCountX = 0;
            }
            if (diagCountX == 4) {
                System.out.println("yay - diagCountX [i][i]");
            }
        }
////search diagonal top left down

        for (int row = 0; row < field.length - 3; row++) {

            for (int col = 0; col < field[row].length - 3; col++) {

                if ((field[row][col] == 'O') && (field[row][col] == field[row + 1][col + 1]) && (field[row][col] == field[row + 3][col + 3]) && (field[row + 2][col + 2] == field[row + 3][col + 3])) {
                    System.out.println("yay - diagTopLeftDownCountO");
                } else if ((field[row][col] == 'X') && (field[row][col] == field[row + 1][col + 1]) && (field[row][col] == field[row + 3][col + 3]) && (field[row + 2][col + 2] == field[row + 3][col + 3])) {
                    System.out.println("yay - diagTopLeftDownCountX");
                }
            }
        }
        // search diagonal bottom left to top right
        // TODO: doesn't work properly
        for (int row = 5; row > 2; row--) {

            for (int col = 0; col < 4; col++) {

             if ((field[col][row] == 'O') && (field[col][row] == field[col + 1][row - 1]) && (field[col + 1][row - 1] == field[col + 2][row - 2]) && (field[col + 2][row - 2] == field[col + 3][row - 3])) {

                    //               if ((field[col][row] == 'O') && (field[col][row] == field[col + 1][row - 1]) && (field[col][row] == field[col + 3][row - 3]) && (field[col + 2][row - 2] == field[col + 3][row - 3])) {
                    System.out.println("yay - diagBottomLeftTotTopCountO");
                } else if ((field[col][row] == 'X') && (field[col][row] == field[col + 1][row - 1]) && (field[col][row] == field[col + 3][row - 3]) && (field[col + 2][row - 2] == field[col + 3][row - 3])) {
                    System.out.println("yay - diagBottomLeftTotTopCountX");
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
