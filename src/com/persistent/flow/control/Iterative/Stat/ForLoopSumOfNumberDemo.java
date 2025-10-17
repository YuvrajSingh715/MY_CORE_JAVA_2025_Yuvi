package com.persistent.flow.control.Iterative.Stat;

public class ForLoopSumOfNumberDemo {

	public static void main(String[] args) {

		int i = 10;
		
		int total = 0;
		
		for (; i > 0; i--) {
			total = total + i;
		}
		
		System.out.println("Sum of first ten digit = "+total);
	
	}

}
