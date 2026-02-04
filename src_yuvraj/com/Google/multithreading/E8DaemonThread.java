package com.Google.multithreading;

public class E8DaemonThread extends Thread {

	@Override
	public void run() {
		for (int a = 5; a > 0; a--) {
			System.out.println("0" + a + " - Child Thread");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {
			}
		}
	}
}
