package com.java.codewars;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        String before = str.chars()
                .mapToObj(c -> (char) c)
                .filter(i -> Character.isLetter(i))
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();

        StringBuilder after = new StringBuilder();
        return after.append(before).reverse().toString();
    }
}
