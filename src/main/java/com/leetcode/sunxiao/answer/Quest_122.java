package com.leetcode.sunxiao.answer;

/**
 * @author ：SunX
 * @date ：2021/4/26 17:22
 * @description：122
 */
public class Quest_122 {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        if (prices == null || prices.length < 2) {
            System.out.println(0);
        }
        int length = prices.length;
        //初始条件
        //持有股票
        int hold = -prices[0];
        //没持有股票
        int noHold = 0;
        for (int i = 1; i < length; i++) {
            //递推公式转化的
            noHold = Math.max(noHold, hold + prices[i]);
            hold = Math.max(hold, noHold - prices[i]);
        }
        //最后一天肯定是手里没有股票的时候利润才会最大，
        //所以这里返回的是noHold
        System.out.println(noHold);


        //贪心算法
        /*for (int i = 1; i < prices.length; i++) {
            max_profit += Math.max(prices[i]-prices[i-1],0);
        }
        System.out.println(max_profit);*/

    }
}
