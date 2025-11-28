package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopSumOfDigitDemo {

	public static void main(String[] args) {

		int num = 8663;
		int total = 0;
		int temp = 0;
		
		while (num > 0) {
			temp = num % 10;
			total = total + temp;
			num = num/10;
			System.out.println(total);
		} 
		System.out.println("sum of digit = " + total);
	}

}
