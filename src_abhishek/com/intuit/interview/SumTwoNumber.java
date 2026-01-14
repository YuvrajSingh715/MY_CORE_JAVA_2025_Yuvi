package com.intuit.interview;

public class SumTwoNumber {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public static void main(String[] args) {
		
		SumTwoNumber c = new SumTwoNumber();
		
		
		System.out.println(c.add(4, 6));
		System.out.println(c.add(3, 5,7));
	}

}
