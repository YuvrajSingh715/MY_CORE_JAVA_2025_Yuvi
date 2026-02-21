package com.Google.ExceptionHandling;

public class Ex15CombinationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("try-block");
		}finally {
			System.out.println("finally-block");
		}
//		catch(Exception e) {
//			System.out.println("catch-block");
//		}
		
	}
}

//C.E -> catch can't exist without try.