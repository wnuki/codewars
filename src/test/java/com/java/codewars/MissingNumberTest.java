package com.java.codewars;

import com.java.codewars.MissingNumber;
import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {

    @Test
    public void findZero() {
        int[] array = new int[] {2,3,4,5,7,8,9};
        int number = MissingNumber.findMissing(array);

        Assert.assertEquals(6, number);
    }

}