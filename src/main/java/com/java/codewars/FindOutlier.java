package com.java.codewars;

public class FindOutlier {
    static int find(int[] integers) {
        int outlier =0;
        int firstThreeParity = Math.abs(integers[0] % 2) + Math.abs(integers[1] % 2) + Math.abs(integers[2] % 2);
        int rem = firstThreeParity < 2 ? 1 : 0;
        for (int i = 0; i < integers.length; i++) {
            if (Math.abs(integers[i] % 2) == rem) {
                outlier = integers[i];
            }
        }
        return outlier;
    }
}
