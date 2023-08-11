package com.leetcode.neosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int i=0,j=0,k=0;
        for(i=0;i<nums.length-2;i++){
            j = i + 1;
            k = nums.length - 1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
                }else if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
	
	public static void main(String[] args) {
		int [] nums = new int[] {1,-1,0,2,-2};
		List<List<Integer>> threeSum = threeSum(nums);
		System.out.println(threeSum);
	}

}
