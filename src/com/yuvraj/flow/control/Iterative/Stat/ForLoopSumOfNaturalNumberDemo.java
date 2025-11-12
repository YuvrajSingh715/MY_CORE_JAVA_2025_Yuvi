package com.yuvraj.flow.control.Iterative.Stat;

public class ForLoopSumOfNaturalNumberDemo {

	public static void main(String[] args) {

		int i = 10;
		
		int total = 0;
		
		for (; i > 0; i--) {
			total = total + i;
		}
		
		System.out.println("Sum of first ten digit = "+total);
	
	}

}
