package com.Google.multithreading;

public class MyThreadDemo extends Thread {

	public static void main(String[] args) {

		MyThreadDemo d = new MyThreadDemo();
	
		d.start();
		//start() --> create new Thread --> after than calls run() --> now run() will excute.
		
	} 
	
//	@Override
//	public  void run() {
//		System.out.println("hellow");
//	}

}

/* 
 * start() method internally calls run() method automatically.
 * Here we will not get any type of S.O.P
 * Because we didn't override the thread class run() method.
 * and by default inside Thread class run() method is declared with empty implementation. 
 * 
 * so it is highly recommended to override the run() method to define your job.
 * 
 */
 