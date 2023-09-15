package com.leetcode.neosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	//Find the sum as target in an int array
	 public static int[] twoSum(int[] nums, int target) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for(int i = 0; i< nums.length; i++){
	            int find = target - nums[i];
	            if(map.containsKey(find)){
	                return new int [] { map.get(find), i};
	            }
	            map.put(nums[i], i);
	        }
	        return null;
	    }

	public static void main(String[] args) {
		int [] nums = new int[] {2,7,11,15};
		int target = 9;
		int[] twoSum = twoSum(nums, target);
		System.out.println(Arrays.toString(twoSum));
	}

}
