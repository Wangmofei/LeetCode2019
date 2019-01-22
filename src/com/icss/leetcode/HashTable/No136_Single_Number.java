package com.icss.leetcode.HashTable;

/*Describtion:

Given a non-empty array of integers, every element appears twice except for one. Find that single one.

/*��Ŀ����:

����һ���ǿ��������飬����ĳ��Ԫ��ֻ����һ�����⣬����ÿ��Ԫ�ؾ��������Ρ��ҳ��Ǹ�ֻ������һ�ε�Ԫ�ء�

/*Example:

����: [2,2,1]
���: 1

*/


/**
 * @author Murphy
 * @Leetcode No.136
 * ����κ�����򶼵����κ���, һ����������ξ͵���0, �ֱ����г�һ��֮��ÿ��Ԫ�ض��������� ������ѭ������������͵��� ֻ����һ�ε��Ǹ��� .
 * ������^ ��ͬΪ0 ��ͬΪ1
 */


public class No136_Single_Number {

	public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
            result = result^nums[i]; //����ж�
        }
        return result;
    }
	
}
