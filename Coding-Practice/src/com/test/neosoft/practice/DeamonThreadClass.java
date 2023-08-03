package com.test.neosoft.practice;

public class DeamonThreadClass {

	public static void main(String [] args) throws InterruptedException {
		Runnable runnable = () -> {
			if(Thread.currentThread().isDaemon()) {
				System.out.println("Current Thread: " + Thread.currentThread().getName() + " is Deamon Thread.");
			} else {
				System.out.println("Current Thread: " + Thread.currentThread().getName() + " is not a Deamon Thread.");
			}
		};
		Thread thread = new Thread(runnable);
		//making thread a deamon
		thread.setDaemon(true);
		thread.setName("deamon");
		//Start Deamon Thread
		thread.start();
		Thread newthread = new Thread(runnable);
		newthread.setDaemon(false);
		newthread.setName("non-deamon");
		newthread.start();
		Thread.sleep(1000);
	}
}
