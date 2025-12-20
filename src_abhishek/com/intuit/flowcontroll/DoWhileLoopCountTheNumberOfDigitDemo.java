package com.intuit.flowcontroll;

public class DoWhileLoopCountTheNumberOfDigitDemo {

	public static void main(String[] args) {
		long num = 876589276;
		long count = 0;
		do{
			num = num/10;
			count++;
		}while (num != 0);
		System.out.println("total digit of numbrt + " +count);
			

	}

}
