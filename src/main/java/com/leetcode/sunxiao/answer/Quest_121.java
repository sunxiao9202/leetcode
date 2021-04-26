package com.leetcode.sunxiao.answer;

/**
 * @author ：SunX
 * @date ：2021/4/26 16:15
 * @description：TODO
 */
public class Quest_121 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices = {7, 6, 4, 3, 1};
//        int[] prices = {1,2};
        int minPrice = prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length ; i++) {
            if (profit < prices[i] - minPrice) {
                profit = prices[i] - minPrice;
            }
            if (minPrice > prices[i]) {
                minPrice = prices[i];
            }
        }
        System.out.println(profit);

        //穷举
        /*int max_profile =0;
        for (int i = 0; i < prices.length-1; i++) {
            for (int j = i+1; j < prices.length; j++) {
                int profile = prices[j]-prices[i];
                if (max_profile<profile){
                    max_profile=profile;
                }
            }
        }
        System.out.println(max_profile>=0?max_profile:0);*/
    }

}
