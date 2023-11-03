package com.leetcode.neosoft;

public class ClimbingStairs {

	//Find the output of no of possible steps taken to complete stairs
	//having only 1 or 2 stairs jump at a time.
	public static int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int prev = 1, curr = 1;
        for (int i = 2; i <= n; i++) {
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;
    }
	
	
	public static void main(String[] args) {
		int climbStairs = climbStairs(3);
		System.out.println(climbStairs);
	}

}
