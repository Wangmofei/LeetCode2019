package com.icss.leetcode.HashTable;

import java.util.HashMap;

/*Describtion:

Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

/*题目描述:

给定两个字符串 s 和 t，判断它们是否是同构的。

如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。

/*Example:

输入: s = "egg", t = "add"
输出: true

*/


/**
 * @author Murphy
 * @Leetcode No.205
 * 经典
 */


public class No205_Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        for(int i = 0 ; i< s.length(); i++){
            char a = s.charAt(i);    
            char b = t.charAt(i);
            if(map.containsKey(a)){        //2.有老A
                 if(map.get(a).equals(b))  //判断一下新B是不是等于老A
                continue;
                else
                return false;
            }else{
                if(!map.containsValue(b))   //3.没老A老B
                map.put(a,b);				//1.4 a和b都空的时候,先添每一位的map(a,b)
                else return false;			//2.没A有有新B的话   就不匹配
                
            }
        }
        return true;
        
    }
}
