package com.icss.leetcode.HashTable;

/*Describtion:

Count the number of prime numbers less than a non-negative number, n.

/*题目描述:

统计所有小于非负整数 n 的质数的数量。

/*Example:
	
输入: 10
输出: 4
解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。

*/


/**
 * @author Murphy
 * @Leetcode No.202
 * 
 */


public class XXX_No204_Count_Primes {

    public int countPrimes(int n) {
        boolean[] m = new boolean[n];
       int count = 0;
       for (int i=2; i<n; i++) {
           if (m[i])
               continue;
            
           count++;
           for (int j=i; j<n; j=j+i)
               m[j] = true;
       }
        
       return count;
   }
}


