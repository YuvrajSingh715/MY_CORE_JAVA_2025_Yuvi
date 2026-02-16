package com.Google.ExceptionHandling;

public class Demo {
	
	public static void main(String[] args) {
		
		System.out.println("main method");
		
		try {                              //inside the try block we write a risky code.
			System.out.println(10/0);
		}catch(ArithmeticException ai) {   //inside the catch block we write a alternative code.
			System.out.println(10/1); 
		}
		
		System.out.println("Gracefully code has excuted");
		
	}

}