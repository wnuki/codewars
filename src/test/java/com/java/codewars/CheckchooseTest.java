package com.java.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CheckchooseTest {

    @Test
    public void BasicTests() {
        assertEquals(2, Checkchoose.checkchoose(6, 4));
        assertEquals(1, Checkchoose.checkchoose(4, 4));
        assertEquals(3, Checkchoose.checkchoose(35, 7));
        assertEquals(-1, Checkchoose.checkchoose(4, 2));
        assertEquals(-1, Checkchoose.checkchoose(36, 7));
    }

}