package com.leetcode.neosoft;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElement {

//	//Approach- 1
//	public int findKthLargest(int[] nums, int k) {
//
//		Arrays.sort(nums);
//		// Can't sort int[] in descending order in Java; ( primitive )
//		// Sort ascending and then return the kth element from the end
//		return nums[nums.length - k];
//	}

	// Approach- 2
	public int findKthLargest(int[] nums, int k) {

		//Priority queue rearranges in ascending order when an element is added one by one
		PriorityQueue<Integer> heap = new PriorityQueue<>();
		for (int num : nums) {
			heap.add(num);
			if (heap.size() > k) {
				heap.remove();
			}
		}

		return heap.peek();
	}
}
