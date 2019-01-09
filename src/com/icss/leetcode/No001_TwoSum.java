package com.icss.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


  
/*Describtion:
	
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		
You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

/*题目描述:

给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。

你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。*/


/*Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1]

*/


/**
 * @author Murphy
 * @Leetcode No001
 * 方法1:暴力循环寻找直到找到对的组合 
 * 方法2:i++循环在MAP字典里寻找target-num[i]的值,结果就是num[i]的i和MAP的Key
 */

public class No001_TwoSum {
	
    public static void twoSum(int[] nums, int target) {
    	
    	int[] solution = new int[2];
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (target == nums[i]+nums[j]) {		
					solution[0] = i;
					solution[1] = j;	
					//System.out.println(Arrays.toString(solution));  //Arrays.toString打印数组
					
				}
			}
		}
		
    	int[] solution2 = new int[2];
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for (int i = 0; i < nums.length; i++) {
        	int Mapvalue = target - nums[i];
        	if(map.containsKey(Mapvalue)){
        		solution2[0] = map.get(Mapvalue);
        		solution2[1] = i;	
        		System.out.println(Arrays.toString(solution2));  //Arrays.toString打印数组
        	}
        	map.put(nums[i], i);
    	}	
    }
       	
    public static void main(String[] args) {
    	int target =16;
    	int[] nums = new int[]{2,4,6,8,10,14};
    	twoSum(nums, target);
	}
}




