package com.intuit.interview;

public class MainBuilder {

	public static void main(String[] args) {

		User user = new User.UserBuilder().setEmailId("abhishek@gmail.com").setUserId("USERUD123")
				.setUserName("Abhishek").build();
		System.out.println(user);

		User user2 = User.UserBuilder.builder().setEmailId("shiva@gmail.com").setUserId("USERID1234")
				.setUserName("Shiva").build();
		System.out.println(user2);

	}

}
