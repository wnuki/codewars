package com.java.codewars;

public class Sum {
    public int GetSum(int a, int b) {

        int sum = 0;

        if (a == b) {
            return a;
        }

        if (a > b) {
            int b1 = a;
            int a1 = b;
            a = a1;
            b = b1;
        }

        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
}