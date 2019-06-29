package com.java.codewars;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }

        int countW = 0;
        int countE = 0;
        int countS = 0;
        int countN = 0;

        for(char dir : walk) {
            if (dir == 'w') {
                countW ++;
            }
            if (dir == 'e') {
                countE++;

            }
            if (dir == 's') {
                countS++;
            }
            if (dir == 'n') {
                countN++;
            }
        }
        return countW == countE && countS == countN;
    }
}
