package com.icss.leetcode.HashTable;

import java.util.HashSet;
import java.util.Set;

/*Describtion:

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, 
and repeat the process until the number equals 1 (where it will stay), 
or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

/*题目描述:



/*Example:



*/


/**
 * @author Murphy
 * @Leetcode No.202
 * 
 */


public class No202_Happy_Number {
	public boolean isHappy(int n) {
		Set<Integer> set =  new HashSet<Integer>();
		set.add(n);
		while(n!= 1){
			n = sum(n);
			if(!set.contains(n)){
				set.add(n);
			}else{
				return false;
			}
		}return true;
	}
	
	public int sum(int num){ //算所有位数的平方和
		int res = 0;
		while(num !=0){
			int i = num%10; //提出个位
			res+=(i*i);
			num /= 10; //消掉个位
		}
		return res;
	}
}
