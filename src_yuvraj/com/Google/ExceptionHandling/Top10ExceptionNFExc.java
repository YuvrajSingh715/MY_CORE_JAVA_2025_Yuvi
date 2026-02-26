package com.Google.ExceptionHandling;

//NumberFormatException

public class Top10ExceptionNFExc {

	public static void main(String[] args) {

		int i = Integer.parseInt("10");
		System.out.println("value of i: " + i);

		String s = String.valueOf(20);
		System.out.println("value of s: " + s);
		
		int i1 = Integer.parseInt("six");
		System.out.println("value of i1: " +i1);
	}

}
