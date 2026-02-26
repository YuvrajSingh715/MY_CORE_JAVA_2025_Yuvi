package com.Google.ExceptionHandling;

//IllegalStateException

public class Top10ExceptionISExc {

	public static void main(String[] args) {

		Thread t = new Thread();

		t.start();
		System.out.println("Hii");
		t.start();

	}

}
