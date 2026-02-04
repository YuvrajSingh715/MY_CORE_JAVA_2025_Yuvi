package com.Google.multithreading;

public class E9InterrupteTest {
	
	public static void main(String[] args) {
		
		E9Interrupte e9 = new E9Interrupte();
		
		e9.start();
		e9.interrupt();
		
		System.out.println("End of the main thread.");
		
	}

}
