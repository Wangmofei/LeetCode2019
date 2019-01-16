package com.icss.leetcode.LinkedList;

/*Describtion:

Reverse a singly linked list.

/*��Ŀ����:

��תһ��������

/*Example:

����: 1->2->3->4->5->NULL
���: 5->4->3->2->1->NULL

*/


/**
 * @author Murphy
 * @Leetcode No.206
 * ����һ �ǵݹ�
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
	        ListNode one = head;        //��һ���ڵ�
	        ListNode two = head.next;   // �ڶ����ڵ�
	        ListNode three;// ��ʱ���
	        while (two != null) {
	            three = two.next; // ��ʱ���last��λ��
	            two.next = one;  // �ڶ����ڵ�ָ���һ���ڵ��ֵ ��ת
	            one = two;// ��һ���ڵ����
	            two = three;// �ڶ����ڵ����
	        }
	        head.next = null;
	        return one;
	    }
	 
	 
	 /**
	  * @author Murphy
	  * @Leetcode No.206
	  * ������ �ݹ�
	  */  
	 
	 public ListNode reverseList2(ListNode head) {
		    if (head == null || head.next == null) return head;
		    ListNode p = reverseList(head.next);//�ݹ��¸���
		    head.next.next = head;//β��ͷ
		    head.next = null;//ͷ��β
		    return p;
		}
}

