package com.icss.leetcode.Arrays;
import java.util.Arrays;


/*Describtion:

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

/*��Ŀ����:

�������������������� nums1 �� nums2���� nums2 �ϲ��� nums1 �У�ʹ�� num1 ��Ϊһ���������顣

/*Example:

����:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

���: [1,2,2,3,5,6]

*/


/**
 * @author Murphy
 * @Leetcode No.088
 * 
 */


public class No088_Merge_Sorted_Array {
	
	public static void merge(int A[], int m, int B[], int n) {
	    int i = m - 1; //I��A���鳤��
	    int j = n - 1;//J��B���鳤��
	    int k = m + n - 1; //����A�����ܿռ�
	  
	    while (k >= 0) {   //��������ռ�ǿ�
	        if (j < 0 || (i >= 0 && A[i] > B[j]))  //B������ �� A��B���һλ�� 
	            A[k--] = A[i--];  //ֱ����A����
	        else
	            A[k--] = B[j--];  //��B����
	    }
	    System.out.println(Arrays.toString(A));
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,3,0,0,0};
		int m=3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
	}

}
