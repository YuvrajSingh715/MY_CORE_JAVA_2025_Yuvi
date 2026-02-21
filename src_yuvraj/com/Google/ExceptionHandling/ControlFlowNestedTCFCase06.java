package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase06 {

	public static void main(String[] args) {

		try {
			System.out.println("Statement-01");
			System.out.println("Statement-02");
			System.out.println("Statement-03");
			try {
				System.out.println("Statement-04");
				System.out.println(3 / 0);
				System.out.println("Statement-06");
			} catch (NullPointerException npe) {
				System.out.println("Statement-07");
			} finally {
				System.out.println("Statement-08");
			}
			System.out.println("Statement-09");
		} catch (ClassCastException cce) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-06: In an exception raised at state 5 and inner and outer catch blocks are not matched then statement 1,2,3,4,8,11 abnormal termination.
