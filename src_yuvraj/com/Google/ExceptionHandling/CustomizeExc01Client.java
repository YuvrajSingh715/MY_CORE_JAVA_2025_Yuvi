package com.Google.ExceptionHandling;

public class CustomizeExc01Client {
	
	public static void main(String[] args) {
		
		int age = 46;
		
		if(age<18) {
			throw new CustomizeExc01TooYoung("Your age is not for marriage at this moment.");
		}else if(age>45) {
			throw new CustomizeExc01TooOld("Your age is already over.");
		}else {
			System.out.println("Your age is perfectly matched.");
		}
	}

}
