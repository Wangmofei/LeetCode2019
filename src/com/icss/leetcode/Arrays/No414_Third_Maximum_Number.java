package com.icss.leetcode.Arrays;

/*Describtion:

Given a non-empty array of integers, return the third maximum number in this array. 

If it does not exist, return the maximum number. The time complexity must be in O(n).

/*��Ŀ����:

����һ���ǿ����飬���ش������е������������������ڣ��򷵻���������������Ҫ���㷨ʱ�临�Ӷȱ�����O(n)��

/*Example:

����: [2, 2, 3, 1]

���: 1

����: [3, 2, 1]

���: 1

*/


/**
 * @author Murphy
 * @Leetcode No.414
 * ʹ�ð�װ��Integer���ֱ����һ�󡢵ڶ��󡢵���������������foreach���������е�ÿ��Ԫ�أ�
 * �����ǰԪ�������������е�����һ����ȣ��ͽ�����һ��ѭ���������һ��Ϊnull���ߵ�ǰԪ�ش��ڵ�һ��
 * ��ô����������������λ�ã�������Ϊԭ�ڶ��󣬵ڶ���Ϊԭ��һ�󣬵�һ��Ϊ��ǰԪ�ء�����ڶ���Ϊnull���ߵ�ǰԪ�ش��ڵڶ���
 * ��ô������Ϊԭ�ڶ��󣬵ڶ���Ϊ��ǰԪ�ء����������Ϊnull���ߵ�ǰԪ�ش��ڵ�������ô������Ϊ��ǰԪ�ء�
 * ������������Ϊnull���ͷ��ص�һ�󣬷�֮���ص�����
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