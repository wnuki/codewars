package com.java.codewars;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String binaryNumer = binary.get(0).toString();
        for (int i = 1; i < binary.size(); i++) {
            binaryNumer = binaryNumer + binary.get(i).toString();
        }
        int decimalNumber = Integer.parseInt(binaryNumer, 2);
        return  decimalNumber;
    }
}
