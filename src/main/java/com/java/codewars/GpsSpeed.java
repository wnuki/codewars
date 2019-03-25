package com.java.codewars;

public class GpsSpeed {
    public static int gps(int s, double[] x) {
        double maxDistance= 0;

        for (int i = 0; i < x.length-1; i++) {
            double actualDistance = (x[i+1] - x[i]);
            if (maxDistance < actualDistance) {
                maxDistance = actualDistance;
            }
        }
        return (int) (3600*maxDistance/s);
    }
}

