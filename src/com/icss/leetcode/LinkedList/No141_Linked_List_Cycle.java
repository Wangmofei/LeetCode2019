package com.icss.leetcode.LinkedList;



/*Describtion:

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.


/*题目描述:

给定一个链表，判断链表中是否有环。

为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。

 
/*Example:

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where tail connects to the second node.


*/


/**
 * @author Murphy
 * @Leetcode No.141
 */


public class No141_Linked_List_Cycle {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	 public boolean hasCycle(ListNode head) {
	        if(head == null || head.next == null){
	        	return false;
	        }
	        ListNode slow = head;  //慢指针
	        ListNode fast = head.next; //快指针
	        while(fast != slow){
	            if (fast == null || fast.next == null) { //遍历完了还不等 
	                return false;
	            }
	        	slow = slow.next;        //移动慢指针
	        	fast = fast.next.next;   //移动快指针
	    }
	    return true;
	    }
}
