package com.Google.yuvraj.flow.control.Iterative.Stat;

public class WhileLoopTableDemo {

	public static void main(String[] args) {

		int i = 1;
		int temp = 5;
		int table = 0;

		while (i <= 10) {
			table = temp * i;
			i++;
			System.out.println(table);
		}

	}

}
