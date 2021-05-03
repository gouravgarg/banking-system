package com.gourav;

import java.util.Arrays;
import java.util.List;

class BuyStock {

    public static long maxProfit(List<Integer> price) {
        long initProfit = price.get(price.size() - 1);
        long maxProfit = 0L;
        for (int i = price.size() - 2; i >= 0; i--) {
            if (price.get(i) > initProfit)
                initProfit = price.get(i);
            else
                maxProfit += initProfit - price.get(i);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        // stock prices on consecutive days

        System.out.println(maxProfit(Arrays.asList(5, 3, 2)));
        System.out.println(maxProfit(Arrays.asList(1, 2, 100)));
        System.out.println(maxProfit(Arrays.asList(1, 3, 1, 2)));

    }
}