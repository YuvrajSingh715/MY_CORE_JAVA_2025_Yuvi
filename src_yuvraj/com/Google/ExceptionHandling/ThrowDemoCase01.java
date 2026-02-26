package com.Google.ExceptionHandling;

public class ThrowDemoCase01 {

	//secnario-1
	static ArithmeticException e;    //For NullPointerException
	
	//secnario-2
//	static ArithmeticException e = new ArithmeticException("/ by zero");    //For ArithmeticException

	public static void main(String[] args) {
		throw e;
	}

}

//If we are trying to throw null reference, we will get NullPointerException.