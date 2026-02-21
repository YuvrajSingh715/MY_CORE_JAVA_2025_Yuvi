package com.Google.ExceptionHandling;

public class CaseFourth {

	public static void main(String[] args) {
		
		try {
			System.out.println("1st Line");
			System.out.println(10/0);
			System.out.println("3rd Line");
		} catch (ArithmeticException ae) {
			System.out.println(10/0);
		}

		System.out.println("5th Line");

	}

}


//if an exception raised at Line-4 or Line-5 it is always abnormal termination.  