package com.icss.leetcode.HashTable;

import java.util.HashMap;
import java.util.Map;



/*Describtion:

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

/*��Ŀ����:

����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�

/*Example:

���� nums = [2, 7, 11, 15], target = 9

��Ϊ nums[0] + nums[1] = 2 + 7 = 9  ���Է��� [0, 1]

*/


/**
 * @author Murphy
 * @Leetcode No.001
 * ����1������
 */


public class No001_Two_Sum {

	public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j <nums.length; j++){
                if(nums[i] + nums[j] == target)
                    return new int[]{i,j};
            }
        }
        return null;
    
    }
	
	/**
	 * @author Murphy
	 * @Leetcode No.001
	 * ����2��ϣ��
	 */	
	
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
           int number = target - nums[i];
           if(map.containsKey(number)){     //����:����������ֵ
               return new int[]{map.get(number),i};  //��������
           } 
            map.put(nums[i], i); //���е�������Ԫ�ز��뵽����
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}


