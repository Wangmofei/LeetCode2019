package com.icss.leetcode;

import java.util.Arrays;


/*Describtion:

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.

/*��Ŀ����:

����һ���Ѱ����������� ���������飬�ҵ�������ʹ���������֮�͵���Ŀ������

����Ӧ�÷����������±�ֵ index1 �� index2������ index1 ����С�� index2��

/*Example:

����: numbers = [2, 7, 11, 15], target = 9
���: [1,2]
����: 2 �� 7 ֮�͵���Ŀ���� 9 ����� index1 = 1, index2 = 2 ��

*/


/**
 * @author Murphy
 * @Leetcode No.167
 * ˫ָ�뷴���ײ
 */


public class No167_Two_Sum_II_Input_array_is_sorted {
	
	public static void twoSum(int[] numbers, int target) {
        int l =0;
        int r = numbers.length-1;
        while(numbers[l]+numbers[r] != target){
            if(numbers[l]+numbers[r]> target) r--;
            else l++;
        }
        System.out.println(Arrays.toString(new int[]{l+1,r+1})); //Arrays.toString ��ӡ���鳣��
    }
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		twoSum(numbers,target);
	}

}
