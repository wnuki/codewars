package com.java.codewars;

import java.util.ArrayList;
import java.util.List;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        List<String> uniqueDir = new ArrayList<>();

        for (String s : arr) {
            if (uniqueDir.isEmpty() || !isOpposite(uniqueDir.get(uniqueDir.size() - 1), s)) {
                uniqueDir.add(s);
            } else {
                uniqueDir.remove(uniqueDir.size() - 1);
            }
        }
        return uniqueDir.toArray(new String[uniqueDir.size()]);
    }

    private static boolean isOpposite(String a, String b) {
        return (a.equals("WEST") && b.equals("EAST")) ||
                (a.equals("EAST") && b.equals("WEST")) ||
                (a.equals("SOUTH") && b.equals("NORTH")) ||
                (a.equals("NORTH") && b.equals("SOUTH"));
    }
}