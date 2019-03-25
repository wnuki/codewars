package com.java.codewars;

import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        long counting;

        for (int number : a) {
            counting = Arrays.stream(a)
                    .filter(i -> i == number)
                    .count();

            if (counting % 2 != 0) {
                return number;
            }
        }

        return 0;
    }
}