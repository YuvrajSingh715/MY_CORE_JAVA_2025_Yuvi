package com.Google.ExceptionHandling;

public class Ex12CombinationOfTCF {

	public static void main(String[] args) {

		try {
			System.out.println("first-try-block");
			System.out.println(10 / 0);
		} catch (ArithmeticException ae1) {
			try {
				System.out.println("second-try-block");
				System.out.println(10 / 0);
			} catch (ArithmeticException ae2) {
				System.out.println(10 / 2);
			}
		}

	}
}
