package com.intuit.loop;

public class SumWithDoWhile {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;

		do {
			sum += num % 10;
			num /= 10;
		} while (num > 10);

		System.out.println(sum);
	}

}
