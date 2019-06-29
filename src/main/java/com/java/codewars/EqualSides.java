package com.java.codewars;

public class EqualSides {
    public static int findEvenIndex(int[] arr) {

        int sumL = 0;
        int sumR = 0;
        int sumTotal = 0;

        for (int i = 0; i < arr.length; i++) {
            sumTotal += arr[i];
        }

        if (arr.length == 1 || sumTotal - arr[0] == 0) {
            return 0;
        }

        for (int i = 1; i < arr.length; i++) {
            sumL += arr[i - 1];
            sumR = sumTotal - sumL - arr[i];

            if (sumR == sumL) {
                return i;
            }
        }
        return -1;
    }
}
