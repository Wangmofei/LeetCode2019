package com.icss.leetcode.Arrays;



/*Describtion:

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

/*题目描述:

给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。


/*Example:

输入: [-2,1,-3,4,-1,2,1,-5,4],
输出: 6
解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。

*/


/**
 * @author Murphy
 * @Leetcode No.053
 * 分冶算法
 */


public class No053_Maximum_Subarray {
	
	public static void maxSubArray(int[] nums) {
        int start = nums[0],end = nums[0];
        for(int i = 1;i<nums.length;i++){
            start = Math.max(start+nums[i],nums[i]);
            end = Math.max(end,start);
        }
        System.out.println(end);
    }
	
	public static void main(String[] args) {
		int[] A = {2,4,2,-5,-1,-5,-3};
		maxSubArray(A);
	}
}
