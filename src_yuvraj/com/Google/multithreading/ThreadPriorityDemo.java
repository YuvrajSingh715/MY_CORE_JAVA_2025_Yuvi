package com.Google.multithreading;

public class ThreadPriorityDemo {

	public static void main(String[] args) {

		System.out.println("Current Thread name: "+Thread.currentThread().getName());
		Thread.currentThread().setName("Main_Thread_001");
		System.out.println("Updated Thread name: "+Thread.currentThread().getName());
		
		System.out.println("Current Priority: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		System.out.println("1st Updated Priority: "+ Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("2nd Updated Priority: "+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(11);   //we will get C.E IllegalArgumentException
		System.out.println("3rd Updated Priority: "+Thread.currentThread().getPriority());
		
	}

}
