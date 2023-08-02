package com.test.neosoft.practice;

import java.lang.reflect.Constructor;

public class ReflectionSingleton {
	public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = null;
        try {
            Constructor constructor = Singleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            instanceTwo = (Singleton) constructor.newInstance();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Hashcode of Object 1: " + instanceOne.hashCode());
        System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());
    }
}
