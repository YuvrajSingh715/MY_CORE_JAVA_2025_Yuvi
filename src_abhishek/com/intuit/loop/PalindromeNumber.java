package com.intuit.loop;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num = 121;
		int temp = num;
		int rev = 0;

		do {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		} while (num > 0);
		if (temp == rev) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not Palindrome");

	}

}
