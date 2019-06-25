package com.java.codewars;

import org.junit.Test;
import static org.junit.Assert.*;

public class PredictYourAgeTest {
    @Test
    public void FixedTests() {
        assertEquals(86, PredictYourAge.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, PredictYourAge.predictAge(32,54,76,65,34,63,64,45));
    }
}