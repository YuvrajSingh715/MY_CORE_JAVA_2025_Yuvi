package com.intuit.interview;

public class ValidAge {
	public static void main(String[] args) {

		int user = 16;

		if (user >= 18) {
			System.out.println("Eligible for  voting");
		} else {
			throw new InvalidAgeException("Not eligible for voting");

		}
	}
}
