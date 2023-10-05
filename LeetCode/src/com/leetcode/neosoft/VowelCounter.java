package com.leetcode.neosoft;

public class VowelCounter {
	
	public static int countVowel(String s) {
		int count = 0;
		for(Character c : s.toCharArray()) {
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			}
		}
		return count;
	}

	//Count no of vowels in a string
	public static void main(String[] args) {
		String s = "adeifgho";
		int totalVowels = countVowel(s);
		System.out.println(totalVowels);
	}

}
