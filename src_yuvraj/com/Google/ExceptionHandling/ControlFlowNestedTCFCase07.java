package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase07 {

	public static void main(String[] args) {

		try {
			System.out.println("Statement-01");
			System.out.println("Statement-02");
			System.out.println("Statement-03");
			try {
				System.out.println("Statement-04");
				System.out.println("Statement-05");
				System.out.println(8 / 0);
			} catch (ArithmeticException npe) {
				System.out.println(7 / 0);
			} finally {
				System.out.println("Statement-08");
			}
			System.out.println("Statement-09");
		} catch (ArithmeticException npe) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-07: If an exception raised at statement 7 and corresponding catch block matched then statement 1,2,3,4,5,8,10,11,12 normal termination.
