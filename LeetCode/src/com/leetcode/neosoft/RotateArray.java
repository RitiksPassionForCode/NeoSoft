package com.leetcode.neosoft;

import java.util.Arrays;

public class RotateArray {

	public static void reverse(int nums[], int start, int end) {
		// While start index is less than end index
		while (start < end) {
			// Swap elements at start and end indices
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			// Increment start index and decrement end index
			start++;
			end--;
		}
	}

	public static void rotate(int[] nums, int k) {
		// Ensure k is within array bounds
		k %= nums.length;
		// Reverse entire array
		reverse(nums, 0, nums.length - 1);
		// Reverse first k elements
		reverse(nums, 0, k - 1);
		// Reverse remaining elements
		reverse(nums, k, nums.length - 1);
	}

	public static void main(String[] args) {
		int[] nums = new int[] { 1, 2 };
		rotate(nums, 3);
		System.out.println(Arrays.toString(nums));

	}

}
