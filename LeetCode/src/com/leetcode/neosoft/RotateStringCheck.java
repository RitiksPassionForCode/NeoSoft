package com.leetcode.neosoft;

public class RotateStringCheck {
	
	public static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        } else {
            String search = s + s;
            if(!search.contains(goal)){
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		boolean rotateString = false;
		try {
			rotateString = rotateString("abcs" , "deabc");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(rotateString);

	}

}
