package com.java.codewars;

public class Checkchoose {
    public static long checkchoose(long m, int n) {
        long choose;
        for (int i = 1; i <= n; i++) {
            choose = factorial(m) / ((factorial(i)) * factorial(m - i));
            if (choose >= m) {
                return choose;
            }
        }
        return -1;
    }

    private static long factorial (long n) {
        long result;
        if (n == 0 || n == 1) {
            return 1;
        }
        if (n < 0) {
            return -1;
        }

        return n * factorial(n - 1);
    }
}
