package com.Google.multithreading;

public class YieldMethodTest {

	public static void main(String[] args) {

		YieldMethod ym = new YieldMethod();
		
		ym.start();
		
		for(char b = 'F'; b<= 'J';b++) {
			System.out.println(b+" - Main Thread !!");
		}
		
	}

}
