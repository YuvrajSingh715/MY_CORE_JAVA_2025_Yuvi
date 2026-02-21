package com.Google.ExceptionHandling;

// ❎

public class Ex8CombinationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("try-block");
		}catch(ArithmeticException ae){
			System.out.println("catch-block");
		}
		
		System.out.println("Hi Guys...");
		
//		catch(Exception e) {
//			System.out.println("catch-block");
//		}
		
	}
}

//C.E -> Catch cannot exist without try.