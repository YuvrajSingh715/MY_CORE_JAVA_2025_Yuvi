package com.Google.multithreading;

public class E0Thread extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {

			System.out.println(i+" - parent class run method.");

		}
		
	}

}
