package com.Google.multithreading;

public class E7Greeting {

	public static synchronized void wish(String name) {      //Here we achive the class level lock and it will work for different objects
//	public synchronized void wish(String name) {               //Here we achive the Object level lock and it will work for same objects

		for (int i = 1; i <= 7; i++) {
			System.out.print(i + "- Time || Good Morning..!! >>-> ");

			try {
				Thread.sleep(2000);
				System.out.println("#" + name);
				Thread.sleep(1000);
			} catch (InterruptedException ie) {

			}
			
		}
		
	}

}
