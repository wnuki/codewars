package com.java.codewars;

import com.java.codewars.Dioph;
import org.junit.Test;
import static org.junit.Assert.*;

public class DiophTest {

    @Test
    public void test1() {
        assertEquals(3, Dioph.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, Dioph.bouncingBall(30.0, 0.66, 1.5));
    }

    }