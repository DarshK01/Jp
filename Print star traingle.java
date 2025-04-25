package com.mycompany.starpatttern;

public class StarPatttern {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 0; k < 5 - 1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int s = 0; s < 5 - 1; s++) {
            for (int k = 0; k <= s; k++) {
                System.out.print(" ");
            }
            for (int i = 5 - 1 - s; i > 0; i--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
