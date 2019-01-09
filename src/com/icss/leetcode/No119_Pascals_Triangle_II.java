package com.icss.leetcode;

import java.util.ArrayList;

/*Describtion:

Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.

/*题目描述:

给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。

/*Example:

输入: 3
输出: [1,3,3,1]

*/


/**
 * @author Murphy
 * @Leetcode No.119
 * 
 */



public class No119_Pascals_Triangle_II  {

	public static void generate(int numRows)
	{
		ArrayList<Integer> row = new ArrayList<Integer>(); //初始化数组
		for(int i=0;i<numRows;i++)   //循环所有排(也等于一排的元素数)
		{
			row.add(0, 1);    //第一个数添加1
			for(int j=1;j<row.size()-1;j++) //除掉第一个数 和最后一个数循环遍历这排
				row.set(j, row.get(j)+row.get(j+1));//j = j + (j+1)
		}
		System.out.println(row);
		
	}
	public static void main(String[] args) {
		generate(4);
	}
	

}
