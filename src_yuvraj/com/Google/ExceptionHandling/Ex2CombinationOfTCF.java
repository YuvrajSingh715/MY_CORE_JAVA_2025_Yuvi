package com.Google.ExceptionHandling;

// ✅

public class Ex2CombinationOfTCF {

	public static void main(String[] args) {

		try {
			System.out.println("Try-Block");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("Child Exception");
		} catch (Exception e) {
			System.out.println("Parent Exception");
		}

	}

}
