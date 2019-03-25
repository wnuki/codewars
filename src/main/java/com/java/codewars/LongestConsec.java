package com.java.codewars;

public class LongestConsec {

    public String toJadenCase(String phrase) {

        if (phrase == null || phrase == "") {
            return null;
        }
        String[] words = phrase.split("\\W+");

        String result = words[0].substring(0,1).toUpperCase() + words[0].substring(1, words[0].length());

        for (int i = 1; i < words.length; i++) {
            words[i] = words[i].substring(0,1).toUpperCase() + words[i].substring(1, words[i].length());
            result = result + " " + words[i];
        }

        return result;
    }
}