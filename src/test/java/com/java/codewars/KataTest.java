package com.java.codewars;

import com.java.codewars.Kata;
import org.junit.Test;
import static org.junit.Assert.*;

public class KataTest {
    @Test
    public void FixedTests() {
        assertEquals(86, Kata.predictAge(65,60,75,55,60,63,64,45));
        assertEquals(79, Kata.predictAge(32,54,76,65,34,63,64,45));
    }
}