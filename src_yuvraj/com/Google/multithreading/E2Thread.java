package com.Google.multithreading;

public class E2Thread extends Thread {
	
	@Override
	public void start() {
//		super.start();   //we are calling Thread class start() method by using super key word.
 		System.out.println("Overrided start() method.");
	}
	
	@Override
	public void run() {
		System.out.println("Overrided run() method.");
	}

}
