package com.Google.ExceptionHandling;

//ExceptionInInitializerError

public class Top10ExceptionEIIErr {
	
//	static int i = 1/0;

	static 
	{
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String[] args) {
		System.out.println("main method");
	}
}
