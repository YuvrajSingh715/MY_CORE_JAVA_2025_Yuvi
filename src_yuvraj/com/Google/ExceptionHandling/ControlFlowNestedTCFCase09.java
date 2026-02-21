package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase09 {

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
				System.out.println(6 / 0);
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

//Case-09: if an exception raised at statement 8 and coressponding catch matched then statement 1,2,3,4,5,6,10,11,12 normal termination.