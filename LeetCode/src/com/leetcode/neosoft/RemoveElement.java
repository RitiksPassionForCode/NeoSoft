package com.leetcode.neosoft;

public class RemoveElement {
	
	//Find the total no of elements after removing given value
	public static int removeElement(int[] nums, int val) {
		int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {1,1,2,3,4,4,55,5};
		int length = removeElement(nums, 1);
		System.out.println(length);
		
	}

}
