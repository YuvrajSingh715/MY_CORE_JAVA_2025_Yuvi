package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
   Write a Regex example to represent all valid mobile numbers.
   1.Mobile number contains 10 digits.
   2.The first digit should not be 0.
 */

public class Q2ValidMobileNumber {
	
	public static void main(String[] args) {
		
		String s = "[1-9]\\d{9}";
		
		Pattern p = Pattern.compile(s);
		Matcher m = p.matcher("2309482852");
		
		if(m.matches()) {
			System.out.println("Valid Mobile Number");
		}else {
			System.out.println("Invalid Mobile Number");
		}
		
	}

}
