package com.Google.ExceptionHandling;

public class CaseSecond {

	public static void main(String[] args) {

		try {
			System.out.println("1st Line");
			System.out.println(10/0);
			System.out.println("3rd Line");
		} catch (ArithmeticException ae) {
			System.out.println("4th Line");
		}

		System.out.println("5th Line");

	}

}

//If exception raised at Line-2 & corresponding CatchBlock matched 1,4,5 are normal terminations.