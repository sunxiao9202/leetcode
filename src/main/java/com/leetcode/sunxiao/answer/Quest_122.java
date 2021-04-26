package com.leetcode.sunxiao.answer;

/**
 * @author ：SunX
 * @date ：2021/4/26 17:22
 * @description：122
 */
public class Quest_122 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int max_profit = 0;
        if (prices == null || prices.length < 2) {
            System.out.println(0);
        }
        //递归算法


        //贪心算法
        /*for (int i = 1; i < prices.length; i++) {
            max_profit += Math.max(prices[i]-prices[i-1],0);
        }
        System.out.println(max_profit);*/

    }
}
