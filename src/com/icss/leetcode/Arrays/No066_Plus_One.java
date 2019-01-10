package com.icss.leetcode.Arrays;

import java.util.Arrays;

/*Describtion:

Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

/*��Ŀ����:

����һ����������ɵķǿ���������ʾ�ķǸ��������ڸ����Ļ����ϼ�һ��

���λ���ִ�����������λ�� ������ÿ��Ԫ��ֻ�洢һ�����֡�

����Լ���������� 0 ֮�⣬��������������㿪ͷ��

/*Example:

����: [4,3,2,1]
���: [4,3,2,2]
����: ���������ʾ���� 4321��

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
			if (digits[i] == 9) {  //��λ
				digits[i] = 0;
				digits[i-1] ++;
			}else{    //����λ
				digits[i]++;
				System.out.println(Arrays.toString(digits));
			}		
		}
				int[] sum = new int[len + 1];  //��λΪ9
				sum[0] = 1;
				System.out.println(Arrays.toString(sum));
			}


	    
	
	public static void main(String[] args) {
		int[] digits = {2,5,3};
		plusOne(digits);
	}
	
}
