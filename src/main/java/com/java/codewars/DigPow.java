package com.java.codewars;

public class DigPow {

    public static long digPow(int n, int p) {

        int sum = 0;
        int modulo;
        int dig;

        if (n > 0) {
            modulo = n % 10;
            sum += (int) Math.pow(modulo, p);
            n /= 10;
            p++;
        }

        return dig = sum/n;
    }

}