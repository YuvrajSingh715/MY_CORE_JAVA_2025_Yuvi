package com.Google.ExceptionHandling;

public class Ex13CombinationOfTCF {

	public static void main(String[] args) {

		try {
			System.out.println("first-try-block");
		} catch (ArithmeticException ae) {
			System.out.println("catch-block");
		} finally {
			System.out.println("first-finally-block");
			try {
				System.out.println("second-try-block");
			} finally {
				System.out.println("second-finally-block");
			}
		}
		
	}
}
