package com.java.codewars;

public class BouncingBall {
    public static int bouncingBall(double h, double bounce, double window) {

        int count = 1;
        if (window >= h || bounce <= 0 || bounce >= 1 || h <= 0) {
            return -1;
        }
        while (bounce * h > window) {
            count += 2;
            h = bounce * h;
        }
        return count;
    }
}