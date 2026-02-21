package com.Google.ExceptionHandling;

public class E1TCFBlockDemo {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block");
		}catch(ArithmeticException ae){
			System.out.println("Catch Block");
		}finally {
			System.out.println("Finally Block");
		}
		
	}

}
