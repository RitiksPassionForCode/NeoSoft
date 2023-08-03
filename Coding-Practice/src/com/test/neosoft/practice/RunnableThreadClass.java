package com.test.neosoft.practice;

public class RunnableThreadClass implements Runnable {

	@Override
	public void run() {
		System.out.println("Current Thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		System.out.println("Inside: " + Thread.currentThread().getName());
		
		System.out.println("Creating Runnable Thread ...");
		RunnableThreadClass runnableThread = new RunnableThreadClass();
		System.out.println("Creating Thread ....");
		Thread thread = new Thread(runnableThread);
		System.out.println("Starting Thread ... ");
		thread.start();
	}
}
