package com.Google.multithreading;

public class JoinMethodTest {

	public static void main(String[] args) throws InterruptedException {

		JoinMethod jm = new JoinMethod();

		jm.start();
		jm.join();
		
//		try {                      
//			jm.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		for (char c = 'A'; c <= 'E'; c++) {
			System.out.println(c + " - Main Thread !!");
		}

	}

}

/*
 * We can handle InterruptedException either by using a try-catch block 
 * or by declaring it with throws in the main method.
 * 
 */