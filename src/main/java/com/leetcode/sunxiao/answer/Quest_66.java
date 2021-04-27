package com.leetcode.sunxiao.answer;

/**
 * @author ：SunX
 * @date ：2021/4/27 15:32
 * @description：TODO
 */
public class Quest_66 {
    public static void main(String[] args) {
        int[] digits = {0};
        System.out.println(plusOne(digits));

    }

    private static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] temp = new int[digits.length + 1];
        if (digits[0]==0){
            temp[0]=1;
        }
        return temp;
    }
}
