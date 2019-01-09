package com.icss.leetcode;

/*Describtion:

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

/*题目描述:

给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

/*Example:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.

*/


/**
 * @author Murphy
 * @Leetcode No.026
 * 快指针先走 和慢指针值不同的时候  说明发现了新的值 i++记录  慢指针走到和快指针一样的位置后 快指针继续向前发现不同的值 i++到循环结束
 */

public class No026_remove_duplicates_from_sorted_array {
	
	
	public static int removeDuplicates(int[] nums) {
		int i = 0;
	    for (int j = 1; j < nums.length; j++) {
			if(nums[i] != nums[j]){
				i++;
				nums[i] = nums[j];
			}
			}
	    System.out.println(i+1);
		return i+1;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
		removeDuplicates(nums);
	}
}

