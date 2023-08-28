package com.leetcode.neosoft;

public class RemoveDuplicatesArray {

	//Remove duplicates from array and return the length of distinct elements in array.
	public static int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
	
	public static void main(String [] args) {
		int [] nums = new int [] {0,0,1,1,1,2,2,3,3,4};
		int removeDuplicates = removeDuplicates(nums);
		System.out.println(removeDuplicates);
	}
}
