package com.icss.leetcode.Arrays;

import java.util.Arrays;

/*Describtion:

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

/*题目描述:

给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

你可以假设除了整数 0 之外，这个整数不会以零开头。

/*Example:

输入: [4,3,2,1]
输出: [4,3,2,2]
解释: 输入数组表示数字 4321。

*/


/**
 * @author Murphy
 * @Leetcode No.066
 * 
 */



public class No066_Plus_One {

	public static void plusOne(int[] digits) {
		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			if (digits[i] == 9) {  //进位
				digits[i] = 0;
				digits[i-1] ++;
			}else{    //不进位
				digits[i]++;
				System.out.println(Arrays.toString(digits));
			}		
		}
				int[] sum = new int[len + 1];  //首位为9
				sum[0] = 1;
				System.out.println(Arrays.toString(sum));
			}


	    
	
	public static void main(String[] args) {
		int[] digits = {2,5,3};
		plusOne(digits);
	}
	
}
