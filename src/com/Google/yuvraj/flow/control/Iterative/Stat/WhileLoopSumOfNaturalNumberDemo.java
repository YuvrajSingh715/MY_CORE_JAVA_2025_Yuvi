package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopSumOfNaturalNumberDemo {

	public static void main(String[] args) {

		byte i = 1;
		int sum = 0;

		while (i <= 10) {
 			sum = sum + i;
			i++;
		}
		System.out.println("Sum of first 10 natural number = "+sum);
	}

}
