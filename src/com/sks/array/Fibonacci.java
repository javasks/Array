package com.sks.array;

public class Fibonacci {

    /**
     * @param number
     * @return Recursive Approach
     * Time Complexity: Exponential
     */
    public static int getFibonacciRecursion(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("n cannot be negative!");
        }
        if (number == 0 || number == 1)
            return number;
        return getFibonacciRecursion(number - 1) + getFibonacciRecursion(number - 2);
    }

    public static int getFibonacciBYMemoization(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("n cannot be negative!");
        }
        if (number == 0 || number == 1)
            return number;
        /**
         * Take two space for storing value
         */
        int a = 0, b = 1;
        int c = a + b;
        for (int i = 2; i <= number; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println("Result From Fibonacci:" + getFibonacciRecursion(6));
        System.out.println("Result From Memoization:" + getFibonacciBYMemoization(6));
    }
}
