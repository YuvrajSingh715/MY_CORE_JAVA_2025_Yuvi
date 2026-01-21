package com.Google.multithreading;

public class E5MyRunnableTest {

	public static void main(String[] args) {

		E5MyRunnable e5 = new E5MyRunnable();
		Thread t1 = new Thread();
		Thread t2 = new Thread(e5);
	    
		//start() method behaviour
//		e5.start()   //start() is not available because e5 is NOT a Thread object.
//		t1.start();  //internally calls run() from Thread class.
//		t2.start();  //internally calls run() from E5MyRunnable class. (recommended)
		
		//run() method behaviour
//		e5.run();     // normal method call, NO new thread created.
//		t1.run();     //Thread class empty run() method will execute.
		t2.run();     // normal method call, executes e5.run() in main thread.
		
		for (char c = 'A'; c <= 'E'; c++) {
			System.out.println(c + " - run() implementation.");
		}

	}

}
