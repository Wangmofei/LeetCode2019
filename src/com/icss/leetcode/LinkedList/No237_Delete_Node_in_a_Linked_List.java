package com.icss.leetcode.LinkedList;

import com.icss.leetcode.LinkedList.No234_Palindrome_Linked_List.ListNode;

/*Describtion:

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9], which looks like following:

/*题目描述:

请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。

现有一个链表 -- head = [4,5,1,9]，它可以表示为:   4 -> 5 -> 1 -> 9

/*Example:

输入: head = [4,5,1,9], node = 5
输出: [4,1,9]

*/


/**
 * @author Murphy
 * @Leetcode No.0
 * 
 */


public class No237_Delete_Node_in_a_Linked_List {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
    public void deleteNode(ListNode node) {
        node.val = node.next.val; //值为下个点的值
        node.next = node.next.next;//下个点指向下下个点
    }
}
