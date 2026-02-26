package com.Google.ExceptionHandling;

public class CustomizeExc02CredentialsClient {

	public static void main(String[] args) {

		String credential = "yuvi567@kl";

		String password = "yuvi517@kl";

		if (password != credential) {
			throw new CustomizeExc02Credentials("OOPS!! You have filled wrong credentials.");
		} else {
			System.out.println("Congratulations! You have successfully logged in to this application.");
		}
	}

}
