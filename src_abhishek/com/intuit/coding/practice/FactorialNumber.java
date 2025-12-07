package com.intuit.coding.practice;

public class FactorialNumber {

	public static void main(String[] args) {
		int x = 5;
		long fact = 1;
		for(int i = 1; i<=x; i++) {
			fact = fact * i;
		
			
		}
		System.out.println("Factorial of " + x + " is: " + fact);
	}

}
