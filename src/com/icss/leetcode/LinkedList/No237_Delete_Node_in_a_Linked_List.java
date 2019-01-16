package com.icss.leetcode.LinkedList;

import com.icss.leetcode.LinkedList.No234_Palindrome_Linked_List.ListNode;

/*Describtion:

Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

Given linked list -- head = [4,5,1,9], which looks like following:

/*��Ŀ����:

���дһ��������ʹ�����ɾ��ĳ�������и����ģ���ĩβ���ڵ㣬�㽫ֻ������Ҫ��ɾ���Ľڵ㡣

����һ������ -- head = [4,5,1,9]�������Ա�ʾΪ:   4 -> 5 -> 1 -> 9

/*Example:

����: head = [4,5,1,9], node = 5
���: [4,1,9]

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
        node.val = node.next.val; //ֵΪ�¸����ֵ
        node.next = node.next.next;//�¸���ָ�����¸���
    }
}
