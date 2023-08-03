package com.test.neosoft.practice;

public class PlayerVolatile {

	private static volatile int counter = 0;

	public static class Player extends Thread {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
					counter++;
				System.out.println("Players updated counter: " + counter);
			}
		}
	}

	public static void main(String[] args) {
		// creating multiple players
		Player player1 = new Player();
		Player player2 = new Player();

		player1.start();
		player2.start();
	}
}
