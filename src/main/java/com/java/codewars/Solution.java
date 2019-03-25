package com.java.codewars;

public class Solution {
    public static int zeros(int n) {
        if (n < 0)
            return -1;

        int count = 0;
        for (int i = 5; (n/i) > 0; i = i * 5) {
            count = count + n / i;
        }
        return count;
    }
}