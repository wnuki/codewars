package com.java.codewars;

import java.util.ArrayList;
import java.util.List;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        List<Character> words1 = new ArrayList<>();
        List<Character> words2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            words1.add(str1.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            words2.add(str2.charAt(i));
        }

        for (int i = 0; i < str2.length(); i++) {
            if (words1.contains(words2.get(i))) {
                int index = words1.indexOf(words2.get(i));
                words1.remove(words1.get(index));
            } else {
                return false;
            }
        }
        return true;
    }
}