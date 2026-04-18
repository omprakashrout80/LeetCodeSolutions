package org.example.leetcode;

public class BestTimeToBuyAnsSellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] prices) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;

    }

}
