package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase03 {

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
		} catch (NullPointerException npe) {
			System.out.println("Statement-10");
		} finally {
			System.out.println("Statement-11");
		}
		System.out.println("Statement-12");

	}
}

//Case-03: If an exception rasied at statement 2 and corresponing catchblock not matched. then Statement 1,11 with abnormal termination.