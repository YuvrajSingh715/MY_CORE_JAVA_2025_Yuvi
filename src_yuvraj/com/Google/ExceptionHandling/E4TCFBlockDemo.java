package com.Google.ExceptionHandling;

public class E4TCFBlockDemo {

	public static void main(String[] args) {

		try {
			System.out.println("Try-Block");
			return;
//			System.out.println("after return any statement is unrechable");
		} catch (ArithmeticException ae) {
			System.out.println("Catch-Block");
		} finally {
			System.out.println("Finally-Block");
		}
		System.out.println("Ending part of Code");
	}
}


/*
 * finally block dominates return statement also. Hence, if there is any return
 * statement present inside try or catch block. first finally will be executed
 * then return statement will be considered.
 *  
 */		   