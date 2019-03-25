package com.java.codewars;

import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        String upperString = text.toUpperCase();
        int count = 0;
        Set<Character> duplicateCharacters = new HashSet<>();

        for (int i = 0; i < upperString.length(); i++) {
            for (int j = i+1; j < upperString.length(); j++) {
                if (upperString.charAt(i) == upperString.charAt(j) ) {
                    duplicateCharacters.add(upperString.charAt(i));
                }
            }
        }

        return duplicateCharacters.size();
    }
}
