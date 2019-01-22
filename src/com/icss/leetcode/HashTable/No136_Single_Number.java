package com.icss.leetcode.HashTable;

/*Describtion:

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

/*题目描述:

给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

/*Example:

输入: [2,2,1]
输出: 1

*/


/**
 * @author Murphy
 * @Leetcode No.136
 * 零和任何数异或都等于任何数, 一个数异或两次就等于0, 又本题中除一个之外每个元素都出现两次 所以用循环异或所有数就等于 只出现一次的那个数 .
 * 异或就是^ 相同为0 不同为1
 */


public class No136_Single_Number {

	public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result^nums[i]; //异或判断
        }
        return result;
    }
	
}
