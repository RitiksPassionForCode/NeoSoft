package com.leetcode.neosoft;

public class BuySellStock {

	public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int overallProfit = 0;
        int profit = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profit = prices[i] - min;
            if(overallProfit < profit){
                overallProfit = profit;
            }
        }
        return overallProfit;
    }
	
	public static void main(String [] args) {
		int [] prices = new int [] {2,1,5,3,8,4};
		int maxProfit = maxProfit(prices);
		System.out.println(maxProfit);
	}
}
