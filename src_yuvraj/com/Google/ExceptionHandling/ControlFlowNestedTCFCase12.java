package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase12 {

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
			System.out.println(9 / 0);
		} catch (ClassCastException cce) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-12: if an exception raised at statement 9 and coressponding catch has not matched then statement 1,2,3,4,5,6,8,11 abnormal termination.
