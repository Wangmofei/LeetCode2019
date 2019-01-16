package com.icss.leetcode.LinkedList;




/*Describtion:

find the node at which the intersection of two singly linked lists begins.

/*题目描述:

找到两个单链表相交的起始节点。

/*Example:

输入：intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
输出：Reference of the node with value = 8
输入解释：相交节点的值为 8 （注意，如果两个列表相交则不能为 0）。
从各自的表头开始算起，链表 A 为 [4,1,8,4,5]，链表 B 为 [5,0,1,8,4,5]。
在 A 中，相交节点前有 2 个节点；在 B 中，相交节点前有 3 个节点。

*/


/**
 * @author Murphy
 * @Leetcode No.0
 * 链表的长度差取决于交点前的长度.分别遍历后连接另一个链表的头,消除长度差, 然后同时遍历，最先相等的结点就是交点。
 */


public class No160_Intersection_of_two_linked_lists {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)return null;
		ListNode node1 = headA; //指针A
		ListNode node2 = headB;//指针B
		while(node1 != node2){//一共转两轮 第一轮消除长度差 第二轮找到交点
			node1 = (node1 == null ? headB : node1.next);//node不空 指针后移 空了就连接到B 
            node2 = (node2 == null ? headA : node2.next);
		}
		return node1;	
	}
}
