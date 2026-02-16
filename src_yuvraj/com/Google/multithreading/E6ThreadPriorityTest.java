package com.Google.multithreading;

public class E6ThreadPriorityTest {

	public static void main(String[] args) {

		E6ThreadPriority tp = new E6ThreadPriority();
		
		//Updating the Priority of Child and Main thread.
		System.out.println("Child Thread Priority: "+tp.getPriority());
		tp.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Child Thread Updated Priority: "+tp.getPriority());
		
		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Main Thread Updated Priority: " + Thread.currentThread().getPriority());
		
		
		//Updating the Name of Child and Main Thread.
		System.out.println("Child Thread name: " + tp.getName());
		tp.setName("Child_Thread_001");
		System.out.println("Updated Child Thread name: "+ tp.getName());
		
		System.out.println("Main Thread name: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Main_Thread_002");
		System.out.println("Updated Main Thread name: "+Thread.currentThread().getName());
		
		tp.start();
		
		for(int b = 4; b<=6; b++) {
			System.out.println(b+" - this is main thread");
		}
		
	}

}
