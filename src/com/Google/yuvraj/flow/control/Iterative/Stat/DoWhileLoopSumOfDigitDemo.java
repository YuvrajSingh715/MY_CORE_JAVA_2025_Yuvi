package com.Google.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopSumOfDigitDemo {

	public static void main(String[] args) {

		int num = 6162;
		int total = 0;
		int temp = 0;

		do {
			temp = num % 10;
			total = total + temp;
			num = num / 10;
//			System.out.println(total);
		} while (num > 0);
		System.out.println("Sum of digit = " + total);
	}

}
