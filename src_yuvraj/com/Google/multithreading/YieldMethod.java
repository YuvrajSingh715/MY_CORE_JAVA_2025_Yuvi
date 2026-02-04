package com.Google.multithreading;

public class YieldMethod extends Thread {

	@Override
	public void run() {
		for (char a = 'A'; a <= 'E'; a++) {
			Thread.yield();
			System.out.println(a + " - Child Thread !");
		}

	}

}

// public static native void yield();