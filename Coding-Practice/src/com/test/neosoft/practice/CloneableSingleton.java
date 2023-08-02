package com.test.neosoft.practice;

public class CloneableSingleton {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton s = Singleton.getInstance();
		Object clone = Singleton.getInstance().clone();
		System.out.println(s);
		System.out.println(clone);
	}
}
