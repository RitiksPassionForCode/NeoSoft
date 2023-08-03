package com.test.neosoft.practice;

public class ThreadInterCommunicationMain {

	public static void main(String args[]) {
		// Book object on which wait and notify method will be called
		Book book = new Book("The Pursuit of Success");
		BookReader ritikReader = new BookReader(book);
		BookReader ravirajReader = new BookReader(book);

		// BookReader threads which will wait for completion of book
		Thread ritikThread = new Thread(ritikReader, "Ritik");
		Thread ravirajThread = new Thread(ravirajReader, "Raviraj");

		ritikThread.start();
		ravirajThread.start();

		// To ensure both readers started waiting for the book
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// BookWriter thread which will notify once book get completed
		BookWriter bookWriter = new BookWriter(book);
		Thread bookWriterThread = new Thread(bookWriter);
		bookWriterThread.start();

	}
}
