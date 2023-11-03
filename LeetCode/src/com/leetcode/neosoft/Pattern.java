package com.leetcode.neosoft;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

	public static List<int[]> groupConsecutivePairs(int[] arr) {
        List<int[]> pairs = new ArrayList<>();
        int start = 0;
        int end = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                end = i;
            } else {
                if (start != end) {
                    pairs.add(new int[]{arr[start], arr[end]});
                }
                start = i;
                end = i;
            }
        }

        if (start != end) {
            pairs.add(new int[]{arr[start], arr[end]});
        }

        return pairs;
    }
	
	public static void main(String[] args) {

		int [] arr = new int [] {1,2,3,5,7,8};
		List<int[]> result = groupConsecutivePairs(arr);
		 for (int[] pair : result) {
	            System.out.println("{" + pair[0] + ", " + pair[1] + "}");
	        }
	}

}
