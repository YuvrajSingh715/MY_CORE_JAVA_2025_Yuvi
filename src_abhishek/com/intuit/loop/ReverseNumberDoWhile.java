package com.intuit.loop;

public class ReverseNumberDoWhile {

	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;

		do {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;

		} while (num > 0);
		System.out.println(rev);
	}

}
