package com.leetcode.neosoft;

public class IntegerFabonacci {

	//Find the fabonacci for the given integer
	public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
	
	public static void main(String [] args) {
		int fib = fib(10);
		System.out.print(fib);
	}
}
