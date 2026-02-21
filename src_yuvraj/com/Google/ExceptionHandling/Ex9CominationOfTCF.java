package com.Google.ExceptionHandling;

// ❎

public class Ex9CominationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("try-block");
		}catch(Exception e){
			System.out.println("catch-block");
		}
		
		System.out.println("Hi Dostonnn...");
		
//		finally {
//			System.out.println("finally-block");
//		}
		
	}
}

//C.E -> finally can't exist without try.
