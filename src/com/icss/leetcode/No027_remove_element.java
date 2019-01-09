package com.icss.leetcode;

/*Describtion:

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

/*题目描述:

给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。

元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

/*Example:

给定 nums = [0,1,2,2,3,0,4,2], val = 2,

函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。

注意这五个元素可为任意顺序。

你不需要考虑数组中超出新长度后面的元素。

*/


/**
 * @author Murphy
 * @Leetcode No.027
 * 方法1:快指针先走 和val值不同的时候  说明发现了新的值 i++记录  慢指针走到和快指针一样的位置后 快指针继续向前发现和val不同的值 i++到循环结束(慢指针做记录 快指针做比较)
 * 方法2:快指针先走 和慢指针值不同的时候  说明发现了新的值 K--记录  和慢指针值相同的时候 把快指针的值与数组最后一位交换,循环变为i-1()
 */



public class No027_remove_element {
	
	public static int removeElement(int[] nums, int val) {
		int i = 0;
	    for (int j = 0; j < nums.length; j++) {
			if(nums[j] != val){
				nums[i] = nums[j];
				i++;
			}
			}
	    System.out.println(i);
		return i;
	}
	
	public static int removeElement2(int[] nums, int val) {

		int k = nums.length;
	    for (int l = 0; l < k; l++) {
			if(nums[l] == val){		
				nums[l] = nums[k-1];
				k--;
			}
			
		}
	    System.out.println(k-1);
		return k-1;
	}

	public static void main(String[] args) {
		int val = 2;
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		removeElement(nums, val);
		removeElement2(nums, val);
	}
}
