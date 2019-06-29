package com.java.codewars;

public class Accumul {

    public static String accum(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            for (int k = 0; k <= i; k++) {
                if (k == 0) {
                    result += Character.toUpperCase(currChar);
                } else {
                    result += Character.toLowerCase(currChar);
                }
            }
            result += "-";
        }
        return result.substring(0, result.length()-1);
    }
}
