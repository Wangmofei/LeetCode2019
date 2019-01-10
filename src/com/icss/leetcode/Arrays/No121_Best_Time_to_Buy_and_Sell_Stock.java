package com.icss.leetcode.Arrays;



/*Describtion:

Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one

/*��Ŀ����:

����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�

��������ֻ�������һ�ʽ��ף������������һ֧��Ʊ�������һ���㷨�����������ܻ�ȡ���������

ע���㲻���������Ʊǰ������Ʊ��

/*Example:

����: [7,1,5,3,6,4]
���: 5
����: �ڵ� 2 �죨��Ʊ�۸� = 1����ʱ�����룬�ڵ� 5 �죨��Ʊ�۸� = 6����ʱ��������������� = 6-1 = 5 ��
     ע���������� 7-1 = 6, ��Ϊ�����۸���Ҫ��������۸�

����: [7,6,4,3,1]
���: 0
����: �����������, û�н������, �����������Ϊ 0��

*/


/**
 * @author Murphy
 * @Leetcode No.121
 * 
 */

public class No121_Best_Time_to_Buy_and_Sell_Stock {
	
	  public static void maxProfit(int[] prices) {
	        int maxporfit = 0;
	        for (int i = 0; i < prices.length; i++) {
				for (int j = i+1; j < prices.length; j++) {
					int profit = prices[j] - prices[i];
					if(profit>maxporfit){
						maxporfit = profit;
					}				
				}
			}
	        System.out.println(maxporfit);
	    }
	  public static void main(String[] args) {
		  int[] prices = {7,1,5,3,6,4};
		  maxProfit(prices);
	}
}
