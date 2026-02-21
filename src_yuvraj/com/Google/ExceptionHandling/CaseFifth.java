package com.Google.ExceptionHandling;

public class CaseFifth{
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Hello Dosto Kaise Hai App...");
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println(10/2);
		}catch(NullPointerException npe) {
			System.out.println(10/5);
		}catch(Exception e) {
			System.out.println((10/1));
		}
		
	}

}

/*
 * In multiple catch blocks, child exceptions must be handled before parent
 * exceptions, otherwise we will compile time error saying, "exception -x- has already been caught.
 * 
 */