package com.intuit.loop;

public class ArmstrongWithDoWhile {

	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;

		do {
			int rem = num % 10;
			sum += rem * rem * rem;
			num /= 10;

		} while (num > 0);

		System.out.println(temp == sum ? "Armstrong" : "Not");
	}

}
