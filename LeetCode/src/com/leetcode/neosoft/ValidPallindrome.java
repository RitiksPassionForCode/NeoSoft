package com.leetcode.neosoft;

public class ValidPallindrome {

	public static boolean isPalindrome(String s) {
		if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst)) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
	
	public static void main(String [] args) {
		String s = "I love it: give me this icecream";
		boolean palindrome = isPalindrome(s);
		System.out.println(palindrome);
	}
}
