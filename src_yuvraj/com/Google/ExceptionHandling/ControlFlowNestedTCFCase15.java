package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase15 {

	public static void main(String[] args) {

		try {
			System.out.println("Statement-01");
			System.out.println("Statement-02");
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
		System.out.println(58 / 0);

	}
}

//Case-15: if an exception raised at statement 12 then it is always abnormal termination.
