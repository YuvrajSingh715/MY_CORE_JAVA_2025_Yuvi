package com.Google.multithreading;

public class E4MyRunnableTest {

	public static void main(String[] args) {

		E4MyRunnable e4 = new E4MyRunnable();
		Thread t1 = new Thread(e4);
		
		//set the thread name
		Thread.currentThread().setName("Yuvi's_Thread");
		System.out.println(Thread.currentThread().getName());
		
		
		t1.start();
//		e4.start();         //start() is not available inside the runnable interface.
//		e4.run();           

		for (int i = 6; i < 10; i++) {
			System.out.println("0" + i + " - main class");
		}

	}

}
