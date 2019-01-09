package com.icss.leetcode;

/*Describtion:

Given an array nums and a value val, remove all instances of that value in-place and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

/*��Ŀ����:

����һ������ nums ��һ��ֵ val������Ҫԭ���Ƴ�������ֵ���� val ��Ԫ�أ������Ƴ���������³��ȡ�

��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�

Ԫ�ص�˳����Ըı䡣�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

/*Example:

���� nums = [0,1,2,2,3,0,4,2], val = 2,

����Ӧ�÷����µĳ��� 5, ���� nums �е�ǰ���Ԫ��Ϊ 0, 1, 3, 0, 4��

ע�������Ԫ�ؿ�Ϊ����˳��

�㲻��Ҫ���������г����³��Ⱥ����Ԫ�ء�

*/


/**
 * @author Murphy
 * @Leetcode No.027
 * ����1:��ָ������ ��valֵ��ͬ��ʱ��  ˵���������µ�ֵ i++��¼  ��ָ���ߵ��Ϳ�ָ��һ����λ�ú� ��ָ�������ǰ���ֺ�val��ͬ��ֵ i++��ѭ������(��ָ������¼ ��ָ�����Ƚ�)
 * ����2:��ָ������ ����ָ��ֵ��ͬ��ʱ��  ˵���������µ�ֵ K--��¼  ����ָ��ֵ��ͬ��ʱ�� �ѿ�ָ���ֵ���������һλ����,ѭ����Ϊi-1()
 */



public class No027_remove_element {
	
	public static int removeElement(int[] nums, int val) {
		int i = 0;
	    for (int j = 0; j < nums.length; j++) {
			if(nums[j] != val){
				nums[i] = nums[j];
				i++;
			}
			}
	    System.out.println(i);
		return i;
	}
	
	public static int removeElement2(int[] nums, int val) {

		int k = nums.length;
	    for (int l = 0; l < k; l++) {
			if(nums[l] == val){		
				nums[l] = nums[k-1];
				k--;
			}
			
		}
	    System.out.println(k-1);
		return k-1;
	}

	public static void main(String[] args) {
		int val = 2;
		int[] nums = new int[]{0,1,2,2,3,0,4,2};
		removeElement(nums, val);
		removeElement2(nums, val);
	}
}
