package com.Google.ExceptionHandling;

public class ThrowsDemoCase02A {

	public static void main(String[] args) {

		try {
			System.out.println("hellow");
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}

	}

}

//if there is no chance of raising an exception then we can't define catch block for that exception otherwise we will get compiletime error.
//but this rule is applicable only for fully checked exceptions.