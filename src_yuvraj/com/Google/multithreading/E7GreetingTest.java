package com.Google.multithreading;

public class E7GreetingTest {

	public static void main(String[] args) {

//		//For Same objects
//		E7Greeting eg1 = new E7Greeting();
//		E7GreetingDemo gd1 = new E7GreetingDemo(eg1, "TEACHER");
//		E7GreetingDemo gd2 = new E7GreetingDemo(eg1, "STUDENT");
		
		//For Different objects
		E7Greeting eg1 = new E7Greeting();
		E7Greeting eg2 = new E7Greeting();
		E7GreetingDemo gd1 = new E7GreetingDemo(eg1, "TEACHER");
		E7GreetingDemo gd2 = new E7GreetingDemo(eg2, "STUDENT");
		
		gd1.start();
		gd2.start();
		
	}
       
}
