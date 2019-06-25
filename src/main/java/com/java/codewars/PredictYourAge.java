package com.java.codewars;

public class PredictYourAge {
    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        int sum = 0;
        int[] age = new int[]{age1, age2, age3, age4, age5, age6, age7, age8};

        for (int aAge : age) {
            aAge = (int) Math.pow(aAge, 2);
            sum += aAge;
        }
        return (int) Math.sqrt(sum) / 2;
    }
}
