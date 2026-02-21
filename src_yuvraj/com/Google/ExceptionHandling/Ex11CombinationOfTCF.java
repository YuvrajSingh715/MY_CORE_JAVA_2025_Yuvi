package com.Google.ExceptionHandling;

public class Ex11CombinationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("try-block");
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println("first-catch-block");
		}
//		catch(ArithmeticException ae1) {
//			System.out.println("second-catch-block");
//		}
		
	}
}

//C.E -> Exception Java.lang.AE has already been caught
