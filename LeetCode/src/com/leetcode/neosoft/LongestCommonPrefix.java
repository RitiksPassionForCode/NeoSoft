package com.leetcode.neosoft;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
		//Strings are none in String Array. 
        if (strs.length == 0) return "";
        
        //Assigning prefix to search in list elements
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
        	//If the prefix found in next element as starting string then increase loop
        	//else the substring will go dead in loop as empty.
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }        
    return prefix;
	}
	
	public static void main(String [] args) {
		String [] strs = {"abcd", "abcdfyh", "abcdde"};
		String longestCommonPrefix = longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}
    
}
