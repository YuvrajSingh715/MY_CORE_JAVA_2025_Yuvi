package com.Google.ExceptionHandling;

public class TryCatchFinallyBlocks {
	
	public static void main(String[] args) {
		
		System.out.println("Main method");
		
		try {                              //inside the try block we write a risky code.
			System.out.println(10/0);
			
		}catch(ArithmeticException ai) {   //inside the catch block we write a exception handling code.
			System.out.println(10/1); 
		
		}finally {                         //inside the finally block we write a cleanup code.
			System.out.println("Finally block executed");
		}
		
		System.out.println("Gracefully code has excuted");
		
	}

}