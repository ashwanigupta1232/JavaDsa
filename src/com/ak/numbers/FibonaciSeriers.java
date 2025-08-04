package com.ak.numbers;

public class FibonaciSeriers {
    public static void main(String[] args) {

      printFibonacciSeries(10);
    }

    public static void printFibonacciSeries(int n) {
        int n1 = 0, n2 = 1, next;

        System.out.print(n1 + " " + n2); // Print the first two numbers

        for (int i = 3; i <= n; i++) {
            next = n1 + n2;
            System.out.print(" " + next); // Print the next number in the series
            n1 = n2;
            n2 = next;
        }

        System.out.println();
    }
}
