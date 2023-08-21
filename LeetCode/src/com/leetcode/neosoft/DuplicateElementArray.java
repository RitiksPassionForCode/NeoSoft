package com.leetcode.neosoft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElementArray {

//	//Using Map
//	public static boolean containsDuplicate(int[] nums) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for(int i = 0; i<nums.length; i++){
//            if(map.containsKey(nums[i])){
//                return true;
//            }
//        map.put(nums[i], count);
//        }
//        return false;
//    }
	
	//Using set
	public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
        set.add(nums[i]);
        }
        return false;
    }
	
	public static void main(String [] args) {
		int [] array = new int [] {1,2,3,4};
		boolean containsDuplicate = containsDuplicate(array);
		System.out.println(containsDuplicate);
	}
}
