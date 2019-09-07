package com.java.codewars;

import java.math.BigInteger;

public class SumFct {
    public static BigInteger perimeter(BigInteger n) {
        int k = n.intValue();

        if (k == 1 || k == 2) {
            return new BigInteger("k").multiply(new BigInteger("4"));
        }
        if (k <= 0) {
            return new BigInteger("-1");
        }

        BigInteger fibonacci = new BigInteger("2");
        BigInteger prevFibonacci = BigInteger.ONE;
        BigInteger sum = new BigInteger("2");
        for (int i = 2; i <= k; i++) {
            sum = sum.add(fibonacci);
            BigInteger temp = fibonacci;
            fibonacci = fibonacci.add(prevFibonacci);
            prevFibonacci = temp;
        }
        return sum.multiply(new BigInteger("4"));
    }
}
