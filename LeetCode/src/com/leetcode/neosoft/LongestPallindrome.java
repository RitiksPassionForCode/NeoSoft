package com.leetcode.neosoft;

public class LongestPallindrome {

	public static int findPallindrome(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(r) == s.charAt(l)) {
			r++;
			l--;
		}
		return r-l-1;
	}

	public static String longestPalindrome(String s) {
		int r = 0;
		int l = 0;
		for (int i = 0; i < s.length(); i++) {
			int len1 = findPallindrome(s, i, i);
			int len2 = findPallindrome(s, i, i + 1);
			int max = Math.max(len1, len2);
			
			if(max>(r-l)+1) {
				l = i-(max-1)/2;
				r = i+max/2;
			}
		}
		return s.substring(l,r+1);
	}

	public static void main(String[] args) {
		String s = "ababa";
		String longestPalindrome = longestPalindrome(s);
		System.out.println(longestPalindrome);

	}

}
