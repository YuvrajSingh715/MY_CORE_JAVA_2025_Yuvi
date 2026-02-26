package com.Google.ExceptionHandling;

public class ThrowsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		caller2();
	}

	public static void caller2() throws InterruptedException {
		caller1();
	}

	public static void caller1() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Hi Guys..");
	}

}
