package com.java.codewars;

public class OddCount {
    public static int oddCount(int n) {

        return n % 2 == 0 ? n / 2 : (n - 1) / 2;
    }

}
