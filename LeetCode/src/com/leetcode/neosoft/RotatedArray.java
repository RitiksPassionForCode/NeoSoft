package com.leetcode.neosoft;

public class RotatedArray {
	
	//Search the index in Rotated Sorted Array of the given target
	public static int search(int[] nums, int target) {
        int found = -1;
        for(int value : nums){
            found ++;
            if(value == target){
                return found;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		int [] nums = new int[] {4,5,6,7,0,1,2};
		int target = 0;
		int index = search(nums, target);
		System.out.println(index);
	}

}
