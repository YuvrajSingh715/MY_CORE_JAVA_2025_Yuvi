package com.Google.yuvraj.Mock_interview;

public class CustomExceptionMain {
	public static void main(String[] args) {
		VotingService service = new VotingService();

		try {
			service.validateAge(16);
		} catch (InvalidAgeException e) {

			System.out.println("Exception caught: " + e.getMessage());
		}

	}

}
