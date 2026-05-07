package com.intuit.multithreading;

public class Test extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
