package com.mycompany.primenumber;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 29; // Example number to check
        boolean isPrime = true;

        // Handle special cases for numbers less than 2
        if (n <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to square root of n
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Output result
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
