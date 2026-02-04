package com.Google.multithreading;

public class E8DaemonThreadTest {
	
	public static void main(String[] args) {
		
		E8DaemonThread t1 = new E8DaemonThread();
		
		System.out.println("Child Thread is daemon or not: "+t1.isDaemon());
		t1.setDaemon(true);
		System.out.println("After using the setDaemon() method: "+ t1.isDaemon());
		
		t1.start();
		
		System.out.println("Main Thread");
	}

}


/* SOME IMPORTANT POINTS.
 * ======================>
 1. After making child thread non-daemon to daemon it will runs in the BackGround and support the non-daemon thread.
 2. The nature of main thread is by default non-daemon. its not possible to change it's Daemon nature.
 3. we can change daemon nature of a thread before startng the  thread.
 4. if we are trying the change after starting the a thread we will get runtimeException saying "IllegalThreadStateException".
 */