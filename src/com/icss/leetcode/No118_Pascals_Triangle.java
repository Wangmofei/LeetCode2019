package com.icss.leetcode;

import java.util.ArrayList;
import java.util.List;

/*Describtion:



/*��Ŀ����:



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
		List<List<Integer>> allrows = new ArrayList<List<Integer>>(); //��ʼ�������
		ArrayList<Integer> row = new ArrayList<Integer>(); //��ʼ������
		for(int i=0;i<numRows;i++)   //ѭ��������(Ҳ����һ�ŵ�Ԫ����)
		{
			row.add(0, 1);    //��һ�������1
			for(int j=1;j<row.size()-1;j++) //������һ���� �����һ����ѭ����������
				row.set(j, row.get(j)+row.get(j+1));//j = j + (j+1)
			allrows.add(new ArrayList<Integer>(row));//�浽allrow��
		}
		System.out.println(allrows);
		
	}
	public static void main(String[] args) {
		generate(8);
	}
	

}
