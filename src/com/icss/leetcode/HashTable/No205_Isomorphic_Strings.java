package com.icss.leetcode.HashTable;

import java.util.HashMap;

/*Describtion:

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

/*��Ŀ����:

���������ַ��� s �� t���ж������Ƿ���ͬ���ġ�

��� s �е��ַ����Ա��滻�õ� t ����ô�������ַ�����ͬ���ġ�

/*Example:

����: s = "egg", t = "add"
���: true

*/


/**
 * @author Murphy
 * @Leetcode No.205
 * ����
 */


public class No205_Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);    
            char b = t.charAt(i);
            if(map.containsKey(a)){        //2.����A
                 if(map.get(a).equals(b))  //�ж�һ����B�ǲ��ǵ�����A
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))   //3.û��A��B
                map.put(a,b);				//1.4 a��b���յ�ʱ��,����ÿһλ��map(a,b)
                else return false;			//2.ûA������B�Ļ�   �Ͳ�ƥ��
                
            }
        }
        return true;
        
    }
}
