package com.Google.ExceptionHandling;

public class Case03ControlFlowTCF {
	
	public static void main(String[] args) {

		try {
			System.out.println("First-Statement");
			System.out.println(10 / 0);
			System.out.println("Thrid-Statement");
		} catch (NullPointerException npe) {
			System.out.println("Forth-Statement");
		} finally {
			System.out.println("Fifth-Statement");
		}
		System.out.println("Six-Statement");
	}

}
