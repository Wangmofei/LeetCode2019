package com.icss.leetcode;

/*Describtion:

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

/*��Ŀ����:

Say you have an array for which the ith element is the price of a given stock on day i.

Design an algorithm to find the maximum profit. You may complete as many transactions as you like (i.e., buy one and sell one share of the stock multiple times).

Note: You may not engage in multiple transactions at the same time (i.e., you must sell the stock before you buy again).

/*Example:

����: [7,1,5,3,6,4]
���: 7
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 3 �죨��Ʊ�۸� = 5����ʱ������, ��ʽ������ܻ������ = 5-1 = 4 ��
     ����ڵ� 4 �죨��Ʊ�۸� = 3����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ������, ��ʽ������ܻ������ = 6-3 = 3 ��

*/


/**
 * @author Murphy
 * @Leetcode No.122
 * 
 */


public class No122_Best_Time_to_Buy_and_Sell_Stock_II {

	  public static void maxProfit(int[] prices) {
	        int maxporfit = 0;
	        for (int i = 0; i < prices.length-1; i++) {
					if(prices[i+1]>prices[i]){
						maxporfit += prices[i+1] - prices[i];
					}				
				}

	        System.out.println(maxporfit);
	    }
	  public static void main(String[] args) {
		  int[] prices = {7,1,5,3,6,4};
		  maxProfit(prices);
	}
}
