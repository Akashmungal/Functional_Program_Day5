package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Column Size");
        int col = scan.nextInt();
        System.out.println("Enter Row Size");
        int row = scan.nextInt();

        twoDArray(row,col);
    }

    public static void twoDArray(int column, int row) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter Value For " + i + "&" + j);
                arr[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
