package com.icss.leetcode;

import java.util.ArrayList;
import java.util.List;

/*Describtion:



/*题目描述:



/*Example:



*/


/**
 * @author Murphy
 * @Leetcode No.118
 * 
 */



public class No118_Pascals_Triangle {

	public static void generate(int numRows)
	{
		List<List<Integer>> allrows = new ArrayList<List<Integer>>(); //初始化结果表
		ArrayList<Integer> row = new ArrayList<Integer>(); //初始化数组
		for(int i=0;i<numRows;i++)   //循环所有排(也等于一排的元素数)
		{
			row.add(0, 1);    //第一个数添加1
			for(int j=1;j<row.size()-1;j++) //除掉第一个数 和最后一个数循环遍历这排
				row.set(j, row.get(j)+row.get(j+1));//j = j + (j+1)
			allrows.add(new ArrayList<Integer>(row));//存到allrow里
		}
		System.out.println(allrows);
		
	}
	public static void main(String[] args) {
		generate(8);
	}
	

}
