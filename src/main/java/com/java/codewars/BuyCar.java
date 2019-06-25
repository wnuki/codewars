package com.java.codewars;


public class BuyCar {
    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        int months = 0;
        double priceOld = startPriceOld;
        double priceNew = startPriceNew;
        int savings = 0;

        if (priceNew <= priceOld + savingperMonth) {
            return new int[]{0, (int) (priceOld + months - priceNew)};
        }

        for (int i = 1; priceNew > priceOld + savings; i++) {
            savings = i * savingperMonth;
            months++;
            if (i % 2 == 0) {
                percentLossByMonth += 0.5;
                priceNew = priceNew * (1 - percentLossByMonth / 100);
                priceOld = priceOld * (1 - percentLossByMonth / 100);

            } else {
                priceNew = priceNew * (1 - percentLossByMonth / 100);
                priceOld = priceOld * (1 - percentLossByMonth / 100);
            }
        }
        return new int[]{months, (int) Math.round(priceOld + savings - priceNew)};
    }
}
