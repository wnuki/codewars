package com.java.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DRootTest {

    @Test
    public void Tests() {
        assertEquals(7, DRoot.digital_root(16));
        assertEquals(6, DRoot.digital_root(456));
    }
}