package com.test.neosoft.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class DeserializeSingelton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Singleton instanceOne = Singleton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
		out.writeObject(instanceOne);
		out.close();

		ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
		Singleton instanceTwo = (Singleton) in.readObject();
		in.close();

		System.out.println("Hashcode of Object 1: " + instanceOne.hashCode());
		System.out.println("Hashcode of Object 2: " + instanceTwo.hashCode());
	}
}
