package com.test.neosoft.practice;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	private static Singleton singelton;

	private Singleton() {
	}

	public static Singleton getInstance() {

		// create object if it's not already created
		if (singelton == null) {
			synchronized (Singleton.class) {
				singelton = new Singleton();
			}
		}

		// returns the singleton object
		return singelton;
	}

}
