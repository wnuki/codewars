package com.java.codewars;

public class XBonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] result = new double[n];

        if (n > 3) {
            for (int i = 0; i < s.length; i++) {
                result[i] = s[i];
            }
            for (int i = 3; i < n; i++) {
                result[i] = result[i - 1] + result[i - 2] + result[i - 3];
            }
        }

        if (n <= 3) {
            for (int i = 0; i < n; i++) {
                result[i] = s[i];
            }
        }
        return result;
    }
}