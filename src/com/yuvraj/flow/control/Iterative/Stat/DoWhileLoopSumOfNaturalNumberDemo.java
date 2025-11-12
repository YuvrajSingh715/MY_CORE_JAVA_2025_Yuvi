package com.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopSumOfNaturalNumberDemo {

	public static void main(String[] args) {

		int i = 10;
		int total = 0;

		do {
			total = total + i;
			i--;
		} while (i > 0);
		System.out.println(total);
	}

}
