package com.mycompany.transpose;

public class Transpose {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix :-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf(arr[i][j] + " ");
            System.out.println();
        }
        int[][] transpose = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Transpose of matrix :- ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.printf(transpose[i][j] + " ");
            System.out.println();
        }
    }
}
