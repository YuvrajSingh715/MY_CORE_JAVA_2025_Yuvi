package com.intuit.java25;

public class PatternMatching {

	private static String obj;

	public static void main(String[] args) {

		//Old Way
		if(obj instanceof String) {
			String s = (String) obj;
			System.out.println(s.length());
		}
		
		//New Way 
		if(obj instanceof String s) {
			System.out.println(s.length());
		}
		

	}

}
