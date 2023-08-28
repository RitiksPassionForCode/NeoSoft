package com.leetcode.neosoft;

public class SearchTargetPosition {
	
	//Search target index and if not found give index where to be inserted
	public static int searchInsert(int[] nums, int target) {
        int i = 0;
            while(nums[i]!=target){
                if(nums[i]>target){
                    return i;
                }
                i++;
                if(i>nums.length-1){
                    break;
                }
            } 
        return i;   
    }

	public static void main(String[] args) {
		int [] nums = new int[] {1,3,5,6};
		int indexSearch = searchInsert(nums, 5);
		System.out.println(indexSearch);

	}

}
