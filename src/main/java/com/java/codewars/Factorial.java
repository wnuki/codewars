package com.java.codewars;

public class Factorial {

    public int factorial(int n) throws IllegalArgumentException {

        if (n < 0 || n > 12) {
            throw new IllegalArgumentException();
        }

        return n == 0 ? 1 : n * factorial(n - 1);
    }
}