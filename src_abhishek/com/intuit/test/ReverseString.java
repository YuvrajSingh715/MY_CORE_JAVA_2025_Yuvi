package com.intuit.test;

public class ReverseString {

	public static void main(String[] args) {
	String str = "Abhishek Singh Kushwah";

	String rev = "";
	
	for(int i = str.length()-1; i>=0; i--) {
		
		rev = rev+str.charAt(i);
		
		
	}
	System.out.println(rev);
	
	}

}
