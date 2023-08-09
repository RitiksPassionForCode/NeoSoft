package com.leetcode.neosoft;

import java.util.Stack;

public class ValidParanthesis {
	
	public static boolean isValid(String s) {
	       Stack<Character> stack = new Stack<>();
	       for(Character c: s.toCharArray()){
	           if(c == '('){
	               stack.push(')');
	           }

	           else if(c == '{'){
	               stack.push('}');
	           }

	           else if(c == '['){
	               stack.push(']');
	           }

	           else if (stack.empty() ||  stack.pop() != c){
	               return false;
	           }
	       }
	       return stack.isEmpty();
	    }
	
	public static void main(String [] args) {
		String s = "{}[]()";
		boolean valid = isValid(s);
		System.out.println(valid);
	}

}
