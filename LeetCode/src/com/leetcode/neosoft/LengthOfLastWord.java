package com.leetcode.neosoft;

public class LengthOfLastWord {
	
	public static int lengthOfLastWord(String s) {
        String [] words = s.split(" ");
        int length = words.length;
        return words[length-1].length();
    }

	public static void main(String[] args) {
		int lengthOfLastWord = lengthOfLastWord("asdsd dasd afdf fdfs");
		System.out.println(lengthOfLastWord);
	}

}
