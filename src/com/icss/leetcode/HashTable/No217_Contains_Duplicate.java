package com.icss.leetcode.HashTable;

import java.util.HashSet;
import java.util.Set;

/*Describtion:

iven an array of integers, find if the array contains any duplicates.

/*题目描述:

给定一个整数数组，判断是否存在重复元素。
如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。

/*Example:

输入: [1,2,3,1]
输出: true

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
            if(set.contains(x)){ //map里查找 有点慢
                return true;
            }else{
                set.add(x);
            }
        }
        return false;
    }
}
