package com.java.codewars;

public class MissingNumber {

    public static int findMissing(int... array) {
        int expectedArraySum = 0;
        int actualArraySum = 0;
        int missingNumber;

        expectedArraySum = (array[0] + array[array.length-1]) * (array.length+1)/2;

        for (int number : array) {
            actualArraySum += number;
        }
        missingNumber = expectedArraySum - actualArraySum;
        return missingNumber;
    }
}
