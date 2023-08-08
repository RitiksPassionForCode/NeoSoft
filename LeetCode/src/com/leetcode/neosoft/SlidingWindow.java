package com.leetcode.neosoft;

import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {

	//print the length of max substring
	public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        int max = 0;
        while(j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max = Math.max(max, set.size());
            } else{
                set.remove(s.charAt(i));
                i++;
            } 
        }
        return max;
    }
	
	public static void main(String [] args) {
		String s = "abcabcbabcdesf";
		int lengthOfLongestSubstring = lengthOfLongestSubstring(s);
		System.out.println(lengthOfLongestSubstring);
	}
}
