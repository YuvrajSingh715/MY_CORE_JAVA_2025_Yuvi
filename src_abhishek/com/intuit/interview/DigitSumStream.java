package com.intuit.interview;

public class DigitSumStream {
	public static void main(String[] args) {
		String strWithNumbers = "Order123 has 45 apples and 6 bananas";

		int sum = strWithNumbers.chars() // Convert to IntStream
				.filter(Character::isDigit) // Keep only digits
				.map(c -> c - '0') // Convert char digit to int
				.sum(); // Sum them

		System.out.println("Sum = " + sum); // Output: 21
	}
}
