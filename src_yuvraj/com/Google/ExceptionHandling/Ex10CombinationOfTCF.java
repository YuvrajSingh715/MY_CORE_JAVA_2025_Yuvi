package com.Google.ExceptionHandling;

// ❎

public class Ex10CombinationOfTCF {

	public static void main(String[] args) {
		
		try {
			System.out.println("try-block");
		}catch(Exception e) {
			System.out.println("catch-block");
		}finally {
			System.out.println("first-finally-block");
		}
//		finally {
//			System.out.println("second-finally-block");
//		}
		
	}
}

//C.E -> finally can't exist without try.