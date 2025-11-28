package com.Google.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopOddDemo {

	public static void main(String[] args) {

		int i = 1;

		do {
			if (i % 2 == 1) {
				System.out.println(i);
			}
			i++;
		} while (i <= 50);
		System.out.println("Now condition is false");
	}

}
