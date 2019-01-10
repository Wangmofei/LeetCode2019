package com.icss.leetcode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Describtion:

Given an array, rotate the array to the right by k steps, where k is non-negative.

/*题目描述:

给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

/*Example:

输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]

*/


/**
 * @author Murphy
 * @Leetcode No.189
 * 
 */

public class No189_Rotate_Array {
	
	public static void rotate(int[] nums, int k) {
		int[] a = new int[nums.length];
        for (int i =0;i<nums.length;i++){
        	a[i] = nums[(i+k)%nums.length];
        }
        System.out.println(Arrays.toString(a));
    }
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7};
		int k =6;
		rotate(nums,k);
	}
}
