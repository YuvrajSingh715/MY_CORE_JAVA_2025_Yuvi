package com.Google.multithreading;

public class E4MyRunnable implements Runnable {
//public class E4MyRunnable extends Thread implements Runnable {          //through this like we can get start() method directly

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++)
		System.out.println( "0"+i+" - implemented run method.");

	}

}
