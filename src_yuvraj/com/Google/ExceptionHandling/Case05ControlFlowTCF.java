package com.Google.ExceptionHandling;

public class Case05ControlFlowTCF {

	public static void main(String[] args) {

		try {
			System.out.println("First-Statement");
			System.out.println(10 / 0);
			System.out.println("Thrid-Statement");
		} catch (ArithmeticException ae) {
			System.out.println("Fourth-Statement");
		} finally {
			System.out.println(10 / 0);
		}
		System.out.println("Six-Statement");
	}

}
