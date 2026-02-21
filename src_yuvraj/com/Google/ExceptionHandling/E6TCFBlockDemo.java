package com.Google.ExceptionHandling;

public class E6TCFBlockDemo {

	public static void main(String[] args) {

		try {
			System.out.println("1-Statement");
			System.out.println(5 / 0);
			System.out.println("2-Statement");
			try {
				System.out.println("3-Statement");
				System.out.println(40 / 0);
				System.out.println("4-Statement");
			} catch (ArithmeticException ae2) {
				System.out.println("Alternative way-1: " + 40 / 8);
			}
		} catch (ArithmeticException ae1) {
			System.out.println("Alternative way-2: " + 5 / 1);
		} finally {
			System.out.println("5-Statement");
		}
		System.out.println("6-Statement");

	}
}
