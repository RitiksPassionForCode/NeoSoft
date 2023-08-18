package com.leetcode.neosoft;

import java.util.Arrays;

public class BuildArrayPermutation {
	
	public static int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
        for(int i =0; i< nums.length; i++){
            ans[i]= nums[nums[i]];
        }
        return ans;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {0,2,1,5,3,4};
		int[] buildArray = buildArray(nums);
		System.out.println(Arrays.toString(buildArray));
	}

}
