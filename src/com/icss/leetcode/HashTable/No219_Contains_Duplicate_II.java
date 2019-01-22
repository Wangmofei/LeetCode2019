package com.icss.leetcode.HashTable;

import java.util.HashMap;
import java.util.Map;

/*Describtion:

Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.

/*题目描述:

给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的绝对值最大为 k。

/*Example:

输入: nums = [1,2,3,1], k = 3
输出: true

*/


/**
 * @author Murphy
 * @Leetcode No.219
 * map.put 哈希表添加
 * map.get(numsP[i]) 获得索引i
 */


public class No219_Contains_Duplicate_II {
	
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(nums[i])) {
            if (i - map.get(nums[i]) <= k) return true;
            }
            map.put(nums[i], i);
        }
             return false;
}
}
