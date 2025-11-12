package com.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopCountTheNumberOfDigitDemo {

	public static void main(String[] args) {

		int num = 15324;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;

		}
		System.out.println(count);
	}

}
