package com.java.codewars;

public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        double time;
        int hours;
        int minutes;
        int seconds;

        if (v2 < v1) {
            return null;
        }

        time = (double) g / (v2 - v1);

        hours = (int) time;
        minutes = (int) (time * 60 - hours * 60);
        seconds = (int) (time * 3600 - hours * 3600 - minutes * 60);

        return new int[] {hours, minutes, seconds};
    }
}