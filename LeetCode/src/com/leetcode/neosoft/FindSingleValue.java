package com.leetcode.neosoft;

public class FindSingleValue {
	
	public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
    }

	public static void main(String[] args) {
		
		int[] nums = new int[] {1,2,2,3,3,4,4};
		int singleNumber = singleNumber(nums);
		System.out.println(singleNumber);	
	}

}
