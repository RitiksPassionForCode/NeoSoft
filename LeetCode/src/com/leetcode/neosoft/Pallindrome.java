package com.leetcode.neosoft;

public class Pallindrome {

	public static boolean isPalindrome(int x) {
        int result = 0;
        int rem = x;
        int y = x;
        while(y != 0){
            rem = y%10;
            result = result * 10 + rem;
            y = y/10;
        }      
        return Math.abs(x) == result;
    }
	
	public static void main(String [] args) {
		boolean palindrome = isPalindrome(121);
		System.out.println(palindrome);
	}
}
