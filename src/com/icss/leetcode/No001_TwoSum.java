package com.icss.leetcode;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


  
/*Describtion:
	
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
		
You may assume that each input would have exactly one solution, and you may not use the same element twice.*/

/*��Ŀ����:

����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ

����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�*/


/*Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,

return [0, 1]

*/


/**
 * @author Murphy
 * @Leetcode No001
 * ����1:����ѭ��Ѱ��ֱ���ҵ��Ե���� 
 * ����2:i++ѭ����MAP�ֵ���Ѱ��target-num[i]��ֵ,�������num[i]��i��MAP��Key
 */

public class No001_TwoSum {
	
    public static void twoSum(int[] nums, int target) {
    	
    	int[] solution = new int[2];
    	for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (target == nums[i]+nums[j]) {		
					solution[0] = i;
					solution[1] = j;	
					//System.out.println(Arrays.toString(solution));  //Arrays.toString��ӡ����
					
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
        		System.out.println(Arrays.toString(solution2));  //Arrays.toString��ӡ����
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




