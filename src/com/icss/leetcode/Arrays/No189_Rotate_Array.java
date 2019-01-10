package com.icss.leetcode.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/*Describtion:

Given an array, rotate the array to the right by k steps, where k is non-negative.

/*��Ŀ����:

����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����

/*Example:

����: [1,2,3,4,5,6,7] �� k = 3
���: [5,6,7,1,2,3,4]
����:
������ת 1 ��: [7,1,2,3,4,5,6]
������ת 2 ��: [6,7,1,2,3,4,5]
������ת 3 ��: [5,6,7,1,2,3,4]

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
