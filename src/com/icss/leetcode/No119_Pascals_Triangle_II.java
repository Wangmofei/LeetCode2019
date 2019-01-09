package com.icss.leetcode;

import java.util.ArrayList;

/*Describtion:

Given a non-negative index k where k �� 33, return the kth index row of the Pascal's triangle.

Note that the row index starts from 0.

/*��Ŀ����:

����һ���Ǹ����� k������ k �� 33������������ǵĵ� k �С�

/*Example:

����: 3
���: [1,3,3,1]

*/


/**
 * @author Murphy
 * @Leetcode No.119
 * 
 */



public class No119_Pascals_Triangle_II  {

	public static void generate(int numRows)
	{
		ArrayList<Integer> row = new ArrayList<Integer>(); //��ʼ������
		for(int i=0;i<numRows;i++)   //ѭ��������(Ҳ����һ�ŵ�Ԫ����)
		{
			row.add(0, 1);    //��һ�������1
			for(int j=1;j<row.size()-1;j++) //������һ���� �����һ����ѭ����������
				row.set(j, row.get(j)+row.get(j+1));//j = j + (j+1)
		}
		System.out.println(row);
		
	}
	public static void main(String[] args) {
		generate(4);
	}
	

}
