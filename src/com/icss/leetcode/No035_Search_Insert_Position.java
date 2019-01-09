package com.icss.leetcode;

/*Describtion:

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

/*��Ŀ����:

����һ�����������һ��Ŀ��ֵ�����������ҵ�Ŀ��ֵ�������������������Ŀ��ֵ�������������У����������ᱻ��˳������λ�á�

����Լ������������ظ�Ԫ�ء�

/*Example:

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 4:

Input: [1,3,5,6], 0
Output: 0

*/


/**
 * @author Murphy
 * @Leetcode No.035
 * ���� �ö��ַ�����target Ч�����
 */

public class No035_Search_Insert_Position {
	
	public static void searchInsert(int[] nums, int target) {
		
		int low  = 0;
		int high = nums.length-1;
		
		while(low <= high){   //����ҪС�� �ǿ��Ե��ڵ�
			int mid = (low + high)/2;
			if (target == nums[mid]) 
				System.out.println(mid);
			else if (target < nums[mid])
				high = mid-1;
			else
				low = mid+1;
		}

		System.out.println(low);
	}

	public static void main(String[] args) {
		int[] array1 = new int[]{1,3,5,6,11,15,18};
		int target = 2;
		searchInsert(array1,target);
		
	}

}
