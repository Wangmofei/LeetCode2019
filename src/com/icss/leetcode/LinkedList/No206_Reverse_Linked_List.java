package com.icss.leetcode.LinkedList;

/*Describtion:

Reverse a singly linked list.

/*题目描述:

反转一个单链表。

/*Example:

输入: 1->2->3->4->5->NULL
输出: 5->4->3->2->1->NULL

*/


/**
 * @author Murphy
 * @Leetcode No.206
 * 方法一 非递归
 * https://mp.weixin.qq.com/s?__biz=MzUyNjQxNjYyMg==&mid=2247483799&idx=1&sn=c2212c8963809e8d3392abeeb851dbfc&chksm=fa0e6e16cd79e7003c2d30b1a2bb4f23dc56df38e3efedd0ab2cfae291609280a832eabe67de&scene=21#wechat_redirect
 */


public class No206_Reverse_Linked_List {

	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
	 public ListNode reverseList(ListNode head) {
	        if (head == null) return head;
	        ListNode one = head;        //第一个节点
	        ListNode two = head.next;   // 第二个节点
	        ListNode three;// 临时结点
	        while (two != null) {
	            three = two.next; // 临时存放last点位置
	            two.next = one;  // 第二个节点指向第一个节点的值 反转
	            one = two;// 第一个节点后移
	            two = three;// 第二个节点后移
	        }
	        head.next = null;
	        return one;
	    }
	 
	 
	 /**
	  * @author Murphy
	  * @Leetcode No.206
	  * 方法二 递归
	  */  
	 
	 public ListNode reverseList2(ListNode head) {
		    if (head == null || head.next == null) return head;
		    ListNode p = reverseList(head.next);//递归下个点
		    head.next.next = head;//尾是头
		    head.next = null;//头是尾
		    return p;
		}
}

