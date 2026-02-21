package com.Google.ExceptionHandling;

public class ExceptionInformationDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("1st Line");
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println(System.lineSeparator() + "Exception Information By printStackTrace()");
			ae.printStackTrace();  
			
			System.out.println(System.lineSeparator() + "Exception Information By toString()");
			System.out.println(ae);  //S.O.P(ae.toString());
			
			System.out.println(System.lineSeparator() + "Exception Information By getMessage()");
			System.out.println(ae.getMessage());
			
		}
		
		System.out.println(System.lineSeparator());
		System.out.println("Last Line");
		
	}
	
}

//default exception handler internally uses printStackTrace() method.

/*
 * Various Methods to print exception information.
 * -----------------------------------------------
 * printStackTrace() -->  Full details + line number 
 * toString()        -->  Class name + Discription
 * getMessage()      -->  Only Discription
 * 
 */

