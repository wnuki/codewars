package com.java.codewars;

public class Money {
    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        while (desired > principal) {
            principal = (principal + principal * interest) - (principal * interest * tax);
            years++;
        }
        return years;
    }
}