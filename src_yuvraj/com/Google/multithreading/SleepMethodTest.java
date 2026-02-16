package com.Google.multithreading;

public class SleepMethodTest {

	public static void main(String[] args) throws InterruptedException {

		SleepMethod sm = new SleepMethod();
		
		sm.start();
		
		for(int i = 1; i<6; i++) {
		System.out.println("Main thread...");
		}
		
	}

}
