package com.Google.ExceptionHandling;

//For Unchecked Exception

public class ThrowsDemoCase01B {

	public static void main(String[] args) {

		throw new Error();

	}

}

//As error is Unchecked Exception, it is not required to handle by try-catch or by throws.
