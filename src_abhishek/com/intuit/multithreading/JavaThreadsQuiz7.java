package com.intuit.multithreading;

public class JavaThreadsQuiz7 {

	public static void main(String[] args) {
		
		MyThread myThread = new MyThread("My_Thread_1.0");
		myThread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException  e){
			e.printStackTrace();
		}
		
 myThread.setName("MY_Thread_2.0");
	}

}
