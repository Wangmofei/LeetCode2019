package com.icss.leetcode.LinkedList;

import com.icss.leetcode.LinkedList.No206_Reverse_Linked_List.ListNode;

/*Describtion:

Given a singly linked list, determine if it is a palindrome.

/*题目描述:

请判断一个链表是否为回文链表。

/*Example:

输入: 1->2->2->1
输出: true

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
	    
	    //找中点 
	    while(fast != null && fast.next != null) {
	        fast = fast.next.next;
	        slow = slow.next;
	    }
	    //当长度是奇数
	    if(fast != null) slow = slow.next;
	    
	    //反转后一半
	    ListNode prev = null;
	    while(slow != null){
	        ListNode temp = slow.next;
	        slow.next = prev;
	        prev = slow;
	        slow = temp;
	    }
	    //比较前后的各一半
	    slow = prev;
	    while(slow != null) {
	        if(head.val != slow.val) return false;
	        head = head.next;
	        slow = slow.next;
	    }
	    return true;
	}
}
