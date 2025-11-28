package com.Google.Mock_interview;

public class VotingService {
	public  void validateAge(int age) throws InvalidAgeException {

		if (age < 18) {

			throw new InvalidAgeException("Age must be 18 or above");

		} else {
			System.out.println("Eligible Age");

		}

	}
}
