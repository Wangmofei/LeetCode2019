package com.icss.leetcode.LinkedList;


/*Describtion:

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/*题目描述:

将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 

/*Example:

输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4

*/


/**
 * @author Murphy
 * @Leetcode No.021
 * 
 */


public class No021_Merge_Two_Sorted_Lists {
	

	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	class Solution {
	    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	    	
	       //新建空链表	
	       ListNode head = new  ListNode(0);
	       ListNode node = head; //一个Head的一个点     
	       
	       //如果l1空返回l2 反之亦然
	       if(l1 == null)return l2;
	       if(l2 == null)return l1;  
	       
	       //都不是空的时候开始判断 
	       while(l1 != null && l2 != null ){
	           if(l1.val < l2.val){
	               node.next = l1;    //新链表加入L1
	               l1 = l1.next;      //L1后移
	           }else{
	               node.next = l2;
	               l2 = l2.next;
	           }
	           node = node.next;  //指向下一个点
	       }
	         if(l1 == null){  //移到L1 或者L2都空了的时候 把剩余的对方链表的接进去
	        	node.next = l2;
	        }else{
	        	node.next = l1;
	        }
	       System.out.println(head.next);
	       return head.next;
	       }
	}
	
	
}
