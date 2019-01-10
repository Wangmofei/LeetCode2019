package com.icss.leetcode;

/*Describtion:

Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array 
such that nums[i] = nums[j] and the absolute difference between i and j is at most k.


/*��Ŀ����:

����һ�����������һ������ k���ж��������Ƿ����������ͬ������ i �� j��ʹ�� nums [i] = nums [j]������ i �� j �Ĳ�ľ���ֵ���Ϊ k��

/*Example:

����: nums = [1,2,3,1,2,3], k = 2
���: false

*/


/**
 * @author Murphy
 * @Leetcode No.219
 * 
 */


public class XXX_No219_Contains_Duplicate_II {

	 public static void containsNearbyDuplicate(int[] nums, int k) {
	        int len = nums.length;
	        for (int i = 0; i < len; i++) {
	        	for (int j = len-1; j>i; j--){
	        		if(nums[i] == nums[j] && j-i<=k  ){
	        			System.out.println(true);
	        			break;
	        		}else{
	        			System.out.println(false);
	        			break;
	        		}
	        	}
			}
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {1,2,3,1};
		 int k = 3;
		 containsNearbyDuplicate(nums,k);
	}
}
