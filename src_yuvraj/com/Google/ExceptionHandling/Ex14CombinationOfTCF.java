package com.Google.ExceptionHandling;

public class Ex14CombinationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("first-try-block");
//			try {
//				System.out.println("second-try-block");
//			}
		}catch(ArithmeticException ae) {
			System.out.println("catch-block");
		}
		
	}
}

//C.E -> try can't exist without without finally or catch.
