package com.leetcode.sunxiao.answer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @author ：SunX
 * @date ：2021/4/27 14:37
 * @description：TODO
 */
public class Quest_350 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if (nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] nums = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            nums[k]= list.get(k);
        }


        /*HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        //先把数组nums1的所有元素都存放到map中，其中key是数组中的元素，value是这个元素出现在数组中的次数
        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        //然后再遍历nums2数组，查看map中是否包含nums2的元素，如果包含，就把当前值加入到集合list中，然后再把对应的value值减1。
        for (int i = 0; i < nums2.length; i++) {
            if (map.getOrDefault(nums2[i], 0) > 0) {
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }

        //把集合list转化为数组
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        for (int re : res) {
            System.out.println(re);
        }*/
    }
}
