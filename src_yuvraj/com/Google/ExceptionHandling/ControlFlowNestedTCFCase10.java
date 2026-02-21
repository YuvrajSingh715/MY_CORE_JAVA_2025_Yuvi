package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase10 {

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
				System.out.println(8/0);
			}
			System.out.println("Statement-09");
		} catch (NullPointerException npe) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-10: if an exception raised at statement 8 and coressponding catch has not matched then statement 1,2,3,4,5,6,11 abnormal termination.
