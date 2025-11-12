package com.yuvraj.flow.control.Iterative.Stat;

public class DoWhileLoopTableDemo {

	public static void main(String[] args) {

		byte b = 1;
		int temp = 9;
		int table = 1;

		do {
			table = temp * b;
			System.out.println(table);
			b++;
		} while (b <= 10);
	}

}
