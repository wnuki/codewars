package com.java.codewars;

import java.lang.Math;

public class NumberFun {
    public static long findNextSquare(long sq) {
        long root = (long) Math.sqrt(sq);
        return Math.pow(root, 2) == sq ? (root + 1) * (root + 1) : -1;
    }
}