package com.icss.leetcode.Arrays;

import java.util.Arrays;


/*Describtion:

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

/*题目描述:

给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

/*Example:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]

*/


/**
 * @author Murphy
 * @Leetcode No.283
 * 把非0的数字左移动 再把0的位置填满
 */


public class No283_Move_Zeroes {
	
    public static void moveZeroes(int[] nums) {
    	if(nums == null || nums.length == 0 ){
    		System.out.println(0);
    	}
    	int r=0;
    	for (int num:nums) { //非0的数字左移动
    		if(num != 0 ){
    			nums[r++] = num;
    		}
		}
    	while(r<nums.length){ // 填满空位
    		nums[r++] = 0;
    	}    	
		System.out.println(Arrays.toString(nums));
}
    
    public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
}
