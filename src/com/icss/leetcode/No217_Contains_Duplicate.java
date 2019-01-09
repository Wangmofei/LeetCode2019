package com.icss.leetcode;

import java.util.Arrays;


/*Describtion:



/*ÌâÄ¿ÃèÊö:



/*Example:



*/


/**
 * @author Murphy
 * @Leetcode No.217
 * 
 */


public class No217_Contains_Duplicate {

    public static void containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
            	System.out.println(true);
            	break;
            }else{
                System.out.println(false);
                break;
            }
    }
        
}
    public static void main(String[] args) {
    	int[] nums = {1,2,3,4};
    	containsDuplicate(nums);
	}
}
