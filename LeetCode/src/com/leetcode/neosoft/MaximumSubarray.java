package com.leetcode.neosoft;

import java.util.Arrays;

public class MaximumSubarray {

	// Length of maximum SubArray
	public static int maxSubArray(int[] nums) {
		int max = nums[0], n = nums.length, sum = 0, temp = 0;
		int start = 0, end = 0;
		int [] subArray = new int[nums.length];
		for (int i = 0; i < n; i++) {
			sum += nums[i];
			if (sum > max) {
				max = sum;
				start = temp;
				end = i;
			}
			if (sum < 0) {
				sum = 0;
				temp = i + 1;
			}
		}
		for (int j = start; j <= end; j++) {
			subArray[j] = nums[j];
		}
		
		//ignore zeroes
		System.out.println(Arrays.toString(subArray));
		
		return max;
	}

	public static void main(String[] args) {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArray = maxSubArray(nums);
		System.out.println(maxSubArray);
	}

}
