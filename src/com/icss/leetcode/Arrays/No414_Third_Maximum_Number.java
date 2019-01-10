package com.icss.leetcode.Arrays;

/*Describtion:

Given a non-empty array of integers, return the third maximum number in this array. 

If it does not exist, return the maximum number. The time complexity must be in O(n).

/*题目描述:

给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。

/*Example:

输入: [2, 2, 3, 1]

输出: 1

输入: [3, 2, 1]

输出: 1

*/


/**
 * @author Murphy
 * @Leetcode No.414
 * 使用包装类Integer，分别定义第一大、第二大、第三大三个变量。foreach遍历数组中的每个元素，
 * 如果当前元素与三个变量中的任意一个相等，就进入下一次循环。如果第一大为null或者当前元素大于第一大，
 * 那么将三个数轮流交换位置，第三大为原第二大，第二大为原第一大，第一大为当前元素。如果第二大为null或者当前元素大于第二大，
 * 那么第三大为原第二大，第二大为当前元素。如果第三大为null或者当前元素大于第三大，那么第三大为当前元素。
 * 最后，如果第三大为null，就返回第一大，反之返回第三大。
 */


public class No414_Third_Maximum_Number {
	
	public int thirdMax(int[] nums) {
        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
    }
}
