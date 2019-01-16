package com.icss.leetcode.LinkedList;

import com.icss.leetcode.LinkedList.No021_Merge_Two_Sorted_Lists.ListNode;

/*Describtion:

Remove all elements from a linked list of integers that have value val.

/*��Ŀ����:

ɾ�������е��ڸ���ֵ val �����нڵ㡣

/*Example:

����: 1->2->6->3->4->5->6, val = 6
���: 1->2->3->4->5

*/


/**
 * @author Murphy
 * @Leetcode No.203
 * ��һ����val ָ���Ųȥ��һ��
 */


public class No203_Remove_Linked_List_Elements {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }

	 public ListNode removeElements(ListNode head, int val) {
		 
		 
	        while(head != null && head.val  == val){
	          head = head.next;
	        }
	        ListNode node = head;   
	        while(node != null && node.next != null){
	            if(node.next.val == val){
	                node.next = node.next.next;
	            }else{
	                node = node.next;
	            }
	        }
	        return head;
	    }
	}

