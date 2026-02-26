package com.Google.ExceptionHandling;

//IllegalArgumentException

public class Top10ExceptionIAExc {

	public static void main(String[] args) {

		Thread t = new Thread();

		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("First update: " + t.getPriority());

		t.setPriority(8);
		System.out.println("Second update: " + t.getPriority());

		t.setPriority(11);
		System.out.println("Third update: " + t.getPriority());
	}

}
