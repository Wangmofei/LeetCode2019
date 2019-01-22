package com.icss.leetcode.HashTable;

import java.util.HashMap;
import java.util.Map;

/*Describtion:

Given an array of integers and an integer k, 
find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] 
and the absolute difference between i and j is at most k.

/*��Ŀ����:

����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k��

/*Example:

����: nums = [1,2,3,1], k = 3
���: true

*/


/**
 * @author Murphy
 * @Leetcode No.219
 * map.put ��ϣ�����
 * map.get(numsP[i]) �������i
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
