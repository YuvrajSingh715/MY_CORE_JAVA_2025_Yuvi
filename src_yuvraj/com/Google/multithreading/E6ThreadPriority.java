package com.Google.multithreading;

public class E6ThreadPriority extends Thread{
	
	@Override
	public void run() {
		for(int a = 1; a<=3; a++) {
			System.out.println(a+" - this is child thread");
		}
		
	}

}
