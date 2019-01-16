package com.icss.leetcode.LinkedList;




/*Describtion:

find the node at which the intersection of two singly linked lists begins.

/*��Ŀ����:

�ҵ������������ཻ����ʼ�ڵ㡣

/*Example:

���룺intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
�����Reference of the node with value = 8
������ͣ��ཻ�ڵ��ֵΪ 8 ��ע�⣬��������б��ཻ����Ϊ 0����
�Ӹ��Եı�ͷ��ʼ�������� A Ϊ [4,1,8,4,5]������ B Ϊ [5,0,1,8,4,5]��
�� A �У��ཻ�ڵ�ǰ�� 2 ���ڵ㣻�� B �У��ཻ�ڵ�ǰ�� 3 ���ڵ㡣

*/


/**
 * @author Murphy
 * @Leetcode No.0
 * ����ĳ��Ȳ�ȡ���ڽ���ǰ�ĳ���.�ֱ������������һ�������ͷ,�������Ȳ�, Ȼ��ͬʱ������������ȵĽ����ǽ��㡣
 */


public class No160_Intersection_of_two_linked_lists {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA == null || headB == null)return null;
		ListNode node1 = headA; //ָ��A
		ListNode node2 = headB;//ָ��B
		while(node1 != node2){//һ��ת���� ��һ���������Ȳ� �ڶ����ҵ�����
			node1 = (node1 == null ? headB : node1.next);//node���� ָ����� ���˾����ӵ�B 
            node2 = (node2 == null ? headA : node2.next);
		}
		return node1;	
	}
}
