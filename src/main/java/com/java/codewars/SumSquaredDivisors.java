package com.java.codewars;

import java.util.stream.LongStream;

import static java.lang.Math.sqrt;

public class SumSquaredDivisors {
    public static String listSquared(long m, long n) {
        String result = "";
        for (long i = m; i <= n; i++) {
            if (Math.round(sqrt(squareDivisors(i))) == sqrt(squareDivisors(i))) {
                result += "[" + i + ", " + squareDivisors(i) + "], ";
            }
        }
        return result.length() > 1 ? "[" + result.substring(0, result.length() - 2) + "]" : "[]";
    }

    private static long squareDivisors (long number) {
        return LongStream.range(1, number + 1)
                .filter(i -> number % i == 0)
                .map(i -> i * i)
                .sum();
    }
 }
