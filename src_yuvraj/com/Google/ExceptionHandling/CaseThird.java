package com.Google.ExceptionHandling;

public class CaseThird {
	
	public static void main(String[] args) {

		try {
			System.out.println("1st Line");
			System.out.println(10/0);
			System.out.println("3rd Line");
		} catch (ClassCastException cce) {
			System.out.println("4th Line");
		}

		System.out.println("5th Line");

	}

}

//If an exception raised at Line-2 & corresponding Catch Block not matched, followed by abnormal termination. 