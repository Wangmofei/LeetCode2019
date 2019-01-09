package com.icss.leetcode;


/*Describtion:

Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

/*题目描述:

给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在众数。

/*Example:

输入: [3,2,3]
输出: 3

*/


/**
 * @author Murphy
 * @Leetcode No.169
 * 
 */


public class No169_Majority_Element {
	
	public static void majorityElement(int[] nums) {
        int L = nums.length / 2;

        for(int i = 0;i<nums.length-1;i++){
        	int t = 1;
        	for(int j = 0;i<nums.length-1;i++){
        		if(nums[i] == nums[j]) {
        			t++;
        	}
        }
        	if(t>L){
        		System.out.println(nums[i]);
        	}
    }
}
	public static void main(String[] args) {
		int[] nums = {3,2,3};
		majorityElement(nums);
	}
}
