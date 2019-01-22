package com.icss.leetcode.HashTable;

/*Describtion:

Count the number of prime numbers less than a non-negative number, n.

/*��Ŀ����:

ͳ������С�ڷǸ����� n ��������������

/*Example:
	
����: 10
���: 4
����: С�� 10 ������һ���� 4 ��, ������ 2, 3, 5, 7 ��

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


