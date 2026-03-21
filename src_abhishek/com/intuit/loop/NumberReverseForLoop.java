package com.intuit.loop;

public class NumberReverseForLoop {

	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;
		for (; num > 0; num /= 10) {
			int rem = num % 10;
			rev = rev * 10 + rem;

		}
		System.out.println(rev);
	}

}
