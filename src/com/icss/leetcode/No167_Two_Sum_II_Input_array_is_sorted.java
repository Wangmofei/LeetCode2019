package com.icss.leetcode;

import java.util.Arrays;


/*Describtion:

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

/*题目描述:

给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。

函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。

/*Example:

输入: numbers = [2, 7, 11, 15], target = 9
输出: [1,2]
解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。

*/


/**
 * @author Murphy
 * @Leetcode No.167
 * 双指针反向对撞
 */


public class No167_Two_Sum_II_Input_array_is_sorted {
	
	public static void twoSum(int[] numbers, int target) {
        int l =0;
        int r = numbers.length-1;
        while(numbers[l]+numbers[r] != target){
            if(numbers[l]+numbers[r]> target) r--;
            else l++;
        }
        System.out.println(Arrays.toString(new int[]{l+1,r+1})); //Arrays.toString 打印数组常用
    }
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		twoSum(numbers,target);
	}

}
