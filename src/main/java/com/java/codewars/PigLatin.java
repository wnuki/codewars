package com.java.codewars;

public class PigLatin {
    public static String pigIt(String str) {
        String[] array = str.split(" ");
        StringBuilder newArray = new StringBuilder();

        for (String word : array) {
            if (word.length() >= 1 && (word.toLowerCase().charAt(0) > 96 && word.toLowerCase().charAt(0) < 123))
                newArray.append(word.substring(1) + word.substring(0, 1) + "ay" + " ");
            else
                newArray.append(word + " ");
        }
        return newArray.toString().trim();
    }
}