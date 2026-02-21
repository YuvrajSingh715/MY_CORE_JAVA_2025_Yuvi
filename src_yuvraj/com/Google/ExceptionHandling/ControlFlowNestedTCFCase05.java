package com.Google.ExceptionHandling;

public class ControlFlowNestedTCFCase05 {

	public static void main(String[] args) {

		try { 
			System.out.println("Statement-01");
			System.out.println("Statement-02");
			System.out.println("Statement-03");
			try {
				System.out.println("Statement-04");
				System.out.println(3/0);
				System.out.println("Statement-06");
			} catch (NullPointerException npe) {
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

//Case-05: If an exception raised at statement 5 and corresponding innercatch has not matched but outer catch has matched. then Statement 
//         1,2,3,4,8,10,11,12 normal termination.

/* _______________
 * 💡 Golden Rule: 
 * --------------- 
 * If inner catch does NOT match the exception
 * type, exception goes to outer catch.
 * 
 */