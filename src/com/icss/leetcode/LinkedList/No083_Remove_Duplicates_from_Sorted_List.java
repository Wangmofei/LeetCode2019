package com.icss.leetcode.LinkedList;



/*Describtion:

Given a sorted linked list, delete all duplicates such that each element appear only once.

/*��Ŀ����:

����һ����������ɾ�������ظ���Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Ρ�

/*Example:

����: 1->1->2
���: 1->2

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
	            if(current.val == current.next.val){//valֵ next��ָ��
	                current.next = current.next.next;
	            }else{
	                current = current.next;
	            }
	        }
	    return head;
	}
}
