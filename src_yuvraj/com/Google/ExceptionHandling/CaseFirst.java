package com.Google.ExceptionHandling;

public class CaseFirst {
	
	public static void main(String[] args) {
		
		try {
			System.out.println("1st Line");
			System.out.println("2nd Line");
			System.out.println("3rd Line");
		}catch(ArithmeticException ae) {
			System.out.println("4th Line");
		}
		
		System.out.println("5th Line");
		
	}

}

//if there is no exception 1,2,3,5 statements are normal terminations.