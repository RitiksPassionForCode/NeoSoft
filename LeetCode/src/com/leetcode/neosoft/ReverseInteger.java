package com.leetcode.neosoft;

public class ReverseInteger {

	public static int reverse(int x) {
        if(x>=2147483647 || x<=-2147483647){
            return 0;
        }
        double finalNum = x%10;
        x = x/10;
        while(x != 0){ 
            int lastDig = x%10;
            finalNum = finalNum*10;
            finalNum += lastDig;
            x= x/10;
        }
        if(finalNum > Integer.MAX_VALUE || finalNum <Integer.MIN_VALUE){
            return 0;
        }
        if(x < 0){
            return (int) (-1*finalNum);
        } else{
            return (int) finalNum;
        }
    }
	
	public static void main(String [] args) {
		int reverse = reverse(123);
		System.out.println(reverse);
	}
}
