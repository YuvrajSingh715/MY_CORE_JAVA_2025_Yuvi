package com.Google.Real_interview;

public class SwapTwoDigit {

	//Swap two digit without using the any third variable
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//first method
//		a = a^b;
//		b = a^b;
//		a = a^b;
		
		//second method 
//		a = b;
//		b = a/2;
		
		//third method
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
	}
    
}
