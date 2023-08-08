package com.leetcode.neosoft;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TargetSum {
	
	//Return the indexes of the array whose target is met.
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
	
	public static void main(String [] args) {
		int target = 5;
		int [] nums = new int[] { 1, 2, 3, 4 ,5 ,7};
		int[] twoSum = twoSum(nums, target);
		if(twoSum != null) {
			System.out.print(Arrays.toString(twoSum));
		} else {
			System.out.println("null");
		}
	}
}
