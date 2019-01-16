package com.icss.leetcode.LinkedList;



/*Describtion:

Given a sorted linked list, delete all duplicates such that each element appear only once.

/*题目描述:

给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。

/*Example:

输入: 1->1->2
输出: 1->2

*/


/**
 * @author Murphy
 * @Leetcode No.083
 * 
 */


public class No083_Remove_Duplicates_from_Sorted_List {

	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	 public ListNode deleteDuplicates(ListNode head) {
	        ListNode current = head;
	        while(current != null && current.next != null){
	            if(current.val == current.next.val){//val值 next是指针
	                current.next = current.next.next;
	            }else{
	                current = current.next;
	            }
	        }
	    return head;
	}
}
