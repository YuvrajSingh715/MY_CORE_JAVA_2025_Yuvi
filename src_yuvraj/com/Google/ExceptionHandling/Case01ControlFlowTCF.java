package com.Google.ExceptionHandling;

public class Case01ControlFlowTCF {

	public static void main(String[] args) {

		try {
			System.out.println("first-statement");
			System.out.println("second-statement");
			System.out.println("thrid-statement");
		} catch (Exception e) {
			System.out.println("fourth-statement");
		} finally {
			System.out.println("fifth-statement");
		}
		System.out.println("sixth-statement");

	}
}
