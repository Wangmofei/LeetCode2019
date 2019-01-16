package com.icss.leetcode.LinkedList;


/*Describtion:

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

/*��Ŀ����:

��������������ϲ�Ϊһ���µ������������ء���������ͨ��ƴ�Ӹ�����������������нڵ���ɵġ� 

/*Example:

���룺1->2->4, 1->3->4
�����1->1->2->3->4->4

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
	    	
	       //�½�������	
	       ListNode head = new  ListNode(0);
	       ListNode node = head; //һ��Head��һ����     
	       
	       //���l1�շ���l2 ��֮��Ȼ
	       if(l1 == null)return l2;
	       if(l2 == null)return l1;  
	       
	       //�����ǿյ�ʱ��ʼ�ж� 
	       while(l1 != null && l2 != null ){
	           if(l1.val < l2.val){
	               node.next = l1;    //���������L1
	               l1 = l1.next;      //L1����
	           }else{
	               node.next = l2;
	               l2 = l2.next;
	           }
	           node = node.next;  //ָ����һ����
	       }
	         if(l1 == null){  //�Ƶ�L1 ����L2�����˵�ʱ�� ��ʣ��ĶԷ�����Ľӽ�ȥ
	        	node.next = l2;
	        }else{
	        	node.next = l1;
	        }
	       System.out.println(head.next);
	       return head.next;
	       }
	}
	
	
}
