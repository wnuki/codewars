package com.java.codewars;

public class ProdFib {
    public static long[] productFib(long prod) {
        long lowFib = 0;
        long highFib = 1;

        while (lowFib * highFib < prod) {
            long tempHigh = highFib;
            highFib += lowFib;
            lowFib = tempHigh;
        }
        return lowFib * highFib == prod ? new long[]{lowFib, highFib, 1} : new long[]{lowFib, highFib, 0};
    }
}
