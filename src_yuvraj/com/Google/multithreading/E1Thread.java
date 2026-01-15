package com.Google.multithreading;

public class E1Thread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Without argument run() method.");
	}
	
	public void run(String s) {
		System.out.println(s + " | With String argument run('Yuvi') method.");
	}

	// Here we can see 2 concept of Oops topic. one is Overriding and second one is Overloading.
	
}
