package com.icss.leetcode.HashTable;

import java.util.HashSet;
import java.util.Set;

/*Describtion:

iven an array of integers, find if the array contains any duplicates.

/*��Ŀ����:

����һ���������飬�ж��Ƿ�����ظ�Ԫ�ء�
����κ�ֵ�������г����������Σ��������� true�����������ÿ��Ԫ�ض�����ͬ���򷵻� false��

/*Example:

����: [1,2,3,1]
���: true

*/


/**
 * @author Murphy
 * @Leetcode No.217
 * 
 */


public class No217_Contains_Duplicate {

    public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<Integer>();
        for(int x: nums){
            if(set.contains(x)){ //map����� �е���
                return true;
            }else{
                set.add(x);
            }
        }
        return false;
    }
}
