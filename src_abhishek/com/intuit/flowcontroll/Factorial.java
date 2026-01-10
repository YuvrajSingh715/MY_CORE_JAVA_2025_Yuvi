package com.intuit.flowcontroll;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		do {
			fact = fact*num;
			num--;
		}while(num>1); {
			System.out.println("factorial value of i = "+fact);
			
		}

	}

}
