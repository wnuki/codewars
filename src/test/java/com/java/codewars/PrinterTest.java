package com.java.codewars;

import com.java.codewars.Printer;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }
}