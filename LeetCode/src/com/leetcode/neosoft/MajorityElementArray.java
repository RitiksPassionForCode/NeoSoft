package com.leetcode.neosoft;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementArray {

	public static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        //Putting elements in the map with their count
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        //The majority element is the element that appears more than ⌊n / 2⌋ times.
        n = n / 2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
    }

	public static void main(String[] args) {
		int[] nums = new int[] {6,6,6,7,7};
		int majorityElement = majorityElement(nums);
		System.out.println(majorityElement);
	}

}
