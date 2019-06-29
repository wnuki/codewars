package com.java.codewars;

public class Order {
    public static String order(String words) {

        if (words.equals("")) {
            return words;
        }

        String[] wordsArr = words.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < wordsArr.length; i++) {
            for (String word : wordsArr) {
                if (word.contains(Integer.toString(i + 1))) {
                    output.append(word).append(" ");
                }
            }
        }
        return output.toString().substring(0, output.length() - 1);
    }
}
