package com.mycompany.sumofarray;

public class Sumofarray {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            sum = sum + arr[i];
        }
        System.out.println("The sum of elements of the array is " + sum);
    }
}
