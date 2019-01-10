package com.icss.leetcode.Arrays;

import java.util.Arrays;


/*Describtion:

Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

/*��Ŀ����:

����һ������ nums����дһ������������ 0 �ƶ��������ĩβ��ͬʱ���ַ���Ԫ�ص����˳��

/*Example:

����: [0,1,0,3,12]
���: [1,3,12,0,0]

*/


/**
 * @author Murphy
 * @Leetcode No.283
 * �ѷ�0���������ƶ� �ٰ�0��λ������
 */


public class No283_Move_Zeroes {
	
    public static void moveZeroes(int[] nums) {
    	if(nums == null || nums.length == 0 ){
    		System.out.println(0);
    	}
    	int r=0;
    	for (int num:nums) { //��0���������ƶ�
    		if(num != 0 ){
    			nums[r++] = num;
    		}
		}
    	while(r<nums.length){ // ������λ
    		nums[r++] = 0;
    	}    	
		System.out.println(Arrays.toString(nums));
}
    
    public static void main(String[] args) {
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
	}
}
