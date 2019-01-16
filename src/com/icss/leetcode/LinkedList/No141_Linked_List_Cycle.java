package com.icss.leetcode.LinkedList;



/*Describtion:

Given a linked list, determine if it has a cycle in it.

To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.


/*��Ŀ����:

����һ���������ж��������Ƿ��л���

Ϊ�˱�ʾ���������еĻ�������ʹ������ pos ����ʾ����β���ӵ������е�λ�ã������� 0 ��ʼ���� ��� pos �� -1�����ڸ�������û�л���

 
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
	        ListNode slow = head;  //��ָ��
	        ListNode fast = head.next; //��ָ��
	        while(fast != slow){
	            if (fast == null || fast.next == null) { //�������˻����� 
	                return false;
	            }
	        	slow = slow.next;        //�ƶ���ָ��
	        	fast = fast.next.next;   //�ƶ���ָ��
	    }
	    return true;
	    }
}