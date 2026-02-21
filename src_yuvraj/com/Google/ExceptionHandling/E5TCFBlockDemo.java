package com.Google.ExceptionHandling;

public class E5TCFBlockDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try-Block");
			System.exit(0);
		} catch (ArithmeticException ae) {
			System.out.println("Catch-Block");
		} finally {
			System.out.println("Finally Block");
		}
	}
}


/*
 * There is only one situation where the finally-block won't be executed is,
 * when ever JVM shutdown or even we are Using System.exit(0)
 */ 