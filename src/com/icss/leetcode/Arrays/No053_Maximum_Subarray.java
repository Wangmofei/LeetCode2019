package com.icss.leetcode.Arrays;



/*Describtion:

Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

/*��Ŀ����:

����һ���������� nums ���ҵ�һ���������͵����������飨���������ٰ���һ��Ԫ�أ������������͡�


/*Example:

����: [-2,1,-3,4,-1,2,1,-5,4],
���: 6
����: ���������� [4,-1,2,1] �ĺ����Ϊ 6��

*/


/**
 * @author Murphy
 * @Leetcode No.053
 * ��ұ�㷨
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
