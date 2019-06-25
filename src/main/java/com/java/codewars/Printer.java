package com.java.codewars;

public class Printer {
    public static String printerError(String s) {
        Integer wrongCharacters = 0;
        Integer totalCharacters = s.length();

        for (int i = 0; i < s.length(); i++) {
            if (s.toLowerCase().charAt(i) > 'm') {
                wrongCharacters++;
            }
        }
        return wrongCharacters.toString() + "/" + totalCharacters.toString();
    }
}
