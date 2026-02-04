package com.Google.multithreading;

public class E3ThreadTest {

	public static void main(String[] args) {

		E3Thread e3 = new E3Thread();
		Thread e1 = new Thread(e3);   //here we give the target tast to the thread cunstructor
		
		e1.start();
		System.out.println("main method");
//		e3.start();  //can't restart the same thread otherwise we will get IllegalThreadStateException.
		
		/*
		 * after stating the thread we are not allowed to restart the same thread once
		 * again otherwise we will get runtime exception saying "IllegalThreadStateException(ITSE)" 
		 * 
		 * -> inside the run() method if we call super.start() we will get the same runtime exception.
		 * 
		 */
		
	}

}
