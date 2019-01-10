package com.icss.leetcode.Arrays;
import java.util.Arrays;


/*Describtion:

Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

/*题目描述:

给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。

/*Example:

输入:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

输出: [1,2,2,3,5,6]

*/


/**
 * @author Murphy
 * @Leetcode No.088
 * 
 */


public class No088_Merge_Sorted_Array {
	
	public static void merge(int A[], int m, int B[], int n) {
	    int i = m - 1; //I是A数组长度
	    int j = n - 1;//J是B数组长度
	    int k = m + n - 1; //最终A数组总空间
	  
	    while (k >= 0) {   //最终数组空间非空
	        if (j < 0 || (i >= 0 && A[i] > B[j]))  //B空数组 或 A比B最后一位大 
	            A[k--] = A[i--];  //直接贴A数组
	        else
	            A[k--] = B[j--];  //贴B数组
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
