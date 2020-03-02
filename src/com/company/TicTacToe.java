package com.company;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("Welcome to TicTacToe");
        System.out.println("********************");

        char[][] field = initializeField();
        printField(field);

        boolean isPlayerOne = true;


        while (true) {
            if (isPlayerOne) {
                System.out.println("Enter your choice Player 1 ");
            } else {
                System.out.println("Enter your choice Player 2");
            }
            Scanner input = new Scanner(System.in);
            String userInput = input.next();
            String[] in = userInput.split(",");
            int x = Integer.parseInt(in[0]);
            int y = Integer.parseInt(in[1]);

            if (isPlayerOne) {

                field[x][y] = 'O';

            } else {
                field[x][y] = 'X';

            }

            isPlayerOne = isPlayerOne ? false : true;
            printField(field);
            if (isGameOver(field)) {
                System.out.println("Vorbei");
            }
        }
    }

    private static boolean isGameOver(char[][] field) {
        for (int i = 0; i < 3; i++) {
            if (field[i][0] == field[i][1] && field[i][1] == field[i][2] && field[i][0] != ' ') {
                return true;
            } else if (field[0][i] == field[1][i] && field[1][i] == field[2][i] && field[0][i] != ' ') {
                return true;
            } else if (field[0][0] == field[1][1] && field[1][1] == field[2][2] && field[i][i] != ' ') {
                return true;
            } else if (field[0][2] == field[1][1] && field[1][1] == field[2][0] && field[2-i][i] != ' ') {
                return true;
            }
        } return false;
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