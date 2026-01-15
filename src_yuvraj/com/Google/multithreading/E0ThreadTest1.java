package com.Google.multithreading;

public class E0ThreadTest1 {

	public static void main(String[] args) {

		E0Thread mt = new E0Thread();
		
		mt.start();    // strat() internally calls run method.
		
		mt.run();      // this is normal calling of run() 
	
		System.out.println("This main class thread");
		
	}

}