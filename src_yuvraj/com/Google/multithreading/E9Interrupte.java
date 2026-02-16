package com.Google.multithreading;

public class E9Interrupte extends Thread {

	@Override
	public void run() {
		try {
			for (int a = 1; a < 50; a++) {
				System.out.println("This is a lazy thread.");
				Thread.sleep(5000);
			}
		} catch (InterruptedException ie) {
			System.out.println("I got interrupted.");
		}
	}
}
