package com.Google.ExceptionHandling;

public class E3TCFBlockDemo {

	public static void main(String[] args) {
		
		try {
			System.out.println("Try Block");
			System.out.println(10/0);
		}catch(NullPointerException npe) {
			System.out.println("Catch Block");
		}finally {
			System.out.println("Finally Block");
		}
		
	}
	
}
