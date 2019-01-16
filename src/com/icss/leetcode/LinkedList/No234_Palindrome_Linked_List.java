package com.icss.leetcode.LinkedList;

import com.icss.leetcode.LinkedList.No206_Reverse_Linked_List.ListNode;

/*Describtion:

Given a singly linked list, determine if it is a palindrome.

/*��Ŀ����:

���ж�һ�������Ƿ�Ϊ��������

/*Example:

����: 1->2->2->1
���: true

*/


/**
 * @author Murphy
 * @Leetcode No.234
 * 
 */


public class No234_Palindrome_Linked_List {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	public boolean isPalindrome(ListNode head) {
		if(head == null) return true;
	    ListNode fast = head;
	    ListNode slow = head;
	    
	    //���е� 
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    //������������
	    if(fast != null) slow = slow.next;
	    
	    //��ת��һ��
	    ListNode prev = null;
	    while(slow != null){
	        ListNode temp = slow.next;
	        slow.next = prev;
	        prev = slow;
	        slow = temp;
	    }
	    //�Ƚ�ǰ��ĸ�һ��
	    slow = prev;
	    while(slow != null) {
	        if(head.val != slow.val) return false;
	        head = head.next;
	        slow = slow.next;
	    }
	    return true;
	}
}
