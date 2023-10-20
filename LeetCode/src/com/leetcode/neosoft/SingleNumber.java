package com.leetcode.neosoft;

public class SingleNumber {
	
	public static int singleNumber(int[] nums) {
        // Initialize the unique number...
        int uniqueNum = 0;
        // TRaverse all elements through the loop...
        for (int idx : nums) {
            // Concept of XOR...
            uniqueNum ^= idx;
        } return uniqueNum;       // Return the unique number...
    }

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,1,3};
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);

	}

}
