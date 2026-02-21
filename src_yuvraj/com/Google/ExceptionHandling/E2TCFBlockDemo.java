package com.Google.ExceptionHandling;

public class E2TCFBlockDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try Block");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae) {
			System.out.println("Catch Block");
		} finally {
			System.out.println("Finally Block");
		}

	}

}
