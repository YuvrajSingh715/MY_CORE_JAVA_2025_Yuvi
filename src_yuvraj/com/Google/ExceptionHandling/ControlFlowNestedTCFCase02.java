package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase02 {

	public static void main(String[] args) {

		try {
			System.out.println("Statement-01");
			System.out.println(20 / 0);
			System.out.println("Statement-03");
			try {
				System.out.println("Statement-04");
				System.out.println("Statement-05");
				System.out.println("Statement-06");
			} catch (Exception e) {
				System.out.println("Statement-07");
			} finally {
				System.out.println("Statement-08");
			}
			System.out.println("Statement-09");
		} catch (ArithmeticException ae) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-02: If an exception raised at statement 2 and corresponding catchblock matched. then Statement 1,10,11,12 with Normal termination.
