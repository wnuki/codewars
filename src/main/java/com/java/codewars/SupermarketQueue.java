package com.java.codewars;

import java.util.*;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        Map<Integer, Integer> tills = addTills(n);

        for (int k = 0; k < customers.length; k++) {
            Integer min = Collections.min(tills.values());
            Integer key = -1;
            for(Map.Entry<Integer, Integer> entry : tills.entrySet()) {
                if (entry.getValue().equals(min)) {
                    key = entry.getKey();
                }
            }
            tills.replace(key, min + customers[k]);
        }
        return Collections.max(tills.values());
    }

    private static Map<Integer, Integer> addTills(int n) {
        Map<Integer, Integer> tills = new HashMap<>();
        for (int i = 0; i < n; i++) {
            tills.put(i, 0);
        }
        return tills;
    }
}