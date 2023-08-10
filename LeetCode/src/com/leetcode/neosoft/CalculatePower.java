package com.leetcode.neosoft;

public class CalculatePower {
	
	// 2pow(100) -> 2pow(50*2) -> 2pow(25*2*2) -> 2*2 + 2pow(24*2*2) -> 2pow(12*2*2*2) -> ....
	
	public static double binaryExp(double x, long n) {
        // Base case, to stop recursive calls.
        if (n == 0) {
            return 1;
        }
       
        // Handle case where, n < 0.
        if (n < 0) {
            return 1.0 / binaryExp(x, -1 * n);
        }
       
        // Perform Binary Exponentiation.
        // If 'n' is odd we perform Binary Exponentiation on 'n - 1' and multiply result with 'x'.
        if (n % 2 == 1) {
            return x * binaryExp(x * x, (n - 1) / 2);
        }
        // Otherwise we calculate result by performing Binary Exponentiation on 'n'.
        else {
            return binaryExp(x * x, n / 2);
        }
    }

	public static void main(String[] args) {
		double powerPositive = binaryExp(10.0, 2);
		double powerNegative = binaryExp(10.0, -2);
		System.out.println(powerPositive);
		System.out.println(powerNegative);

	}

}
