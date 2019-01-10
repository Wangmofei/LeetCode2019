package com.icss.leetcode;

import java.util.Arrays;


/*Describtion:

Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

/*��Ŀ����:

����һ������ 0, 1, 2, ..., n �� n ���������У��ҳ� 0 .. n ��û�г����������е��Ǹ�����

/*Example:

����: [9,6,4,2,3,5,7,0,1]
���: 8

*/


/**
 * @author Murphy
 * @Leetcode No.0
 * 
 */


public class No268_Missing_Numbers {

	public static void missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length <=2){
            for(int i = 1; i<nums.length;i++){
            	if(nums[i] - nums[i-1] != 1){
            		System.out.println(nums[i-1]+1);
            	}
            	System.out.println(nums[nums.length-1]+1);
            }    	
        }else{
        	System.out.println(nums[0]+1);
        }
    }
	
	public static void main(String[] args) {
		int[] nums = {0,1};
		missingNumber(nums);
	}

}
