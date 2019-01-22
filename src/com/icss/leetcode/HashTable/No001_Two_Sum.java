package com.icss.leetcode.HashTable;

import java.util.HashMap;
import java.util.Map;



/*Describtion:

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

/*题目描述:

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。

/*Example:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9  所以返回 [0, 1]

*/


/**
 * @author Murphy
 * @Leetcode No.001
 * 方法1暴力解
 */


public class No001_Two_Sum {

	public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    
    }
	
	/**
	 * @author Murphy
	 * @Leetcode No.001
	 * 方法2哈希表
	 */	
	
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           int number = target - nums[i];
           if(map.containsKey(number)){     //查找:如果包含这个值
               return new int[]{map.get(number),i};  //返回数组
           } 
            map.put(nums[i], i); //进行迭代并将元素插入到表中
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


