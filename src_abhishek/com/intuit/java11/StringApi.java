package com.intuit.java11;

public class StringApi {

	public static void main(String[] args) {
	
		String s = " ";
		System.out.println(s.isBlank());
		String b = "Abhishek";
		System.out.println(b.isBlank());
		System.out.println(b.isEmpty());
		
		" Hello ".strip().lines().forEach(System.out::println);
		"Hi\nHello".lines().forEach(System.out::println);

	}

}
