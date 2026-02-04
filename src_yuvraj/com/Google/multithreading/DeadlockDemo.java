package com.Google.multithreading;

public class DeadlockDemo {

	static final Object chaiCup = new Object();
	static final Object coffeeCup = new Object();

	public static void main(String[] args) {

		Thread friendA = new Thread(() -> {

			synchronized (chaiCup) {
				System.out.println("Friend-A: I got the Chai.");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				synchronized (coffeeCup) {
					System.out.println("Friend-A: I want the Coffee.");
				}
			}
		});

		Thread friendB = new Thread(() -> {

			synchronized (coffeeCup) {
				System.out.println("Friend-B: I got the Coffee.");

				try {
					Thread.sleep(1000);
				} catch (InterruptedException ie) {
				}

				synchronized (chaiCup) {
					System.out.println("Friend-B: I want the Chai.");

				}
			}
		});
		
		friendA.start();
		friendB.start();
		
	}

}
