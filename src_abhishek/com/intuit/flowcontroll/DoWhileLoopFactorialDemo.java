package com.intuit.flowcontroll;

public class DoWhileLoopFactorialDemo {

	public static void main(String[] args) {

		int i = 6;
		int fact = 1;
		do {
			fact = fact * i;
			i--;

		} while (i > 1);
   System.out.println(fact);
	}

}
