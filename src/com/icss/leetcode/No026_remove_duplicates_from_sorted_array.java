package com.icss.leetcode;

/*Describtion:

Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

/*��Ŀ����:

����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

/*Example:

Given nums = [0,0,1,1,1,2,2,3,3,4],

Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.

It doesn't matter what values are set beyond the returned length.

*/


/**
 * @author Murphy
 * @Leetcode No.026
 * ��ָ������ ����ָ��ֵ��ͬ��ʱ��  ˵���������µ�ֵ i++��¼  ��ָ���ߵ��Ϳ�ָ��һ����λ�ú� ��ָ�������ǰ���ֲ�ͬ��ֵ i++��ѭ������
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

