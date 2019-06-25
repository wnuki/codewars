package com.java.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TripleDoubleTest {
    @Test
    public void test1(){
        assertEquals(1, TripleDouble.tripleDouble(451999277L, 41177722899L));
    }

    @Test
    public void test2(){
        assertEquals(0, TripleDouble.tripleDouble(1222345L, 12345L));
    }

    @Test
    public void test3(){
        assertEquals(0, TripleDouble.tripleDouble(12345L, 12345L));
    }

    @Test
    public void test4(){
        assertEquals(1, TripleDouble.tripleDouble(666789L, 12345667L));
    }

    @Test
    public void test5() {
        assertEquals(0, TripleDouble.tripleDouble(451999277L, 411777228L));
    }

    @Test
    public void test6() {
        assertEquals(0, TripleDouble.tripleDouble(1112L, 122L));
    }
}