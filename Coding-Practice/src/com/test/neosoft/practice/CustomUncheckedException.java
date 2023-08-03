package com.test.neosoft.practice;

public class CustomUncheckedException {

	public static void main(String [] args) throws CastException {
		try {
		Object obj = new String("Hello");
        System.out.println((Integer) obj);
		} catch(ClassCastException e) {
			try {
				throw new CastException("Integer cannot be casted to string object.", e);
			} catch(Exception cast) {
				cast.getMessage();
				cast.printStackTrace();
			}
		}
	}
}
