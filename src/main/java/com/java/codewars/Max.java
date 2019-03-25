package com.java.codewars;

public class Max {
    public static int sequence(int[] arr) {
        int maxLocal = 0;
        int maxTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            maxLocal = Math.max(arr[i], maxLocal + arr[i]);
            maxTotal = Math.max(maxLocal, maxTotal);
        }
        return maxTotal;
    }
}
