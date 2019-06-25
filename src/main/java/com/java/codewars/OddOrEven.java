package com.java.codewars;

import java.util.stream.IntStream;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        String result = IntStream.of(array).sum() % 2 == 0 ? "even" : "odd";

        return result;
    }
}
