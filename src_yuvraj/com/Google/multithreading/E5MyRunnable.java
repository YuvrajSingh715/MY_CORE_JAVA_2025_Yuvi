package com.Google.multithreading;

public class E5MyRunnable implements Runnable {

	@Override
	public void run() {
		for (char c = 'a'; c <= 'e'; c++) {
			System.out.println(c + " - run() implementation.");
		}
	}
	
}
