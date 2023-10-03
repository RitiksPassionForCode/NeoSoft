package com.leetcode.neosoft;

public class FindDifferenceXOR {
	
	public static char findTheDifference(String s, String t) {
        char c = 0;
        for(char cs : s.toCharArray()){
            c ^= cs;
        } 
        for(char ct : t.toCharArray()){
            c ^= ct;
        } 
        return c;   
    }
	
	//Difference between two strings	
	public static void main(String [] args) {
		String s = "abcd";
		String t = "abcde";
		char findTheDifference = findTheDifference(s, t);
		System.out.println(findTheDifference);
	}

}
