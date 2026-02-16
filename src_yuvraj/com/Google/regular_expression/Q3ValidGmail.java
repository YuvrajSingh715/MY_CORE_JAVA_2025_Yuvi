package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q3ValidGmail {

	public static void main(String[] args) {
		
		String formate = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}";
		
		Pattern p = Pattern.compile(formate);
		Matcher m = p.matcher("yuvraj2@gmail.com");
		
		if(m.matches()) {
			System.out.println("Valid Email ID");
		}else {
			System.out.println("Invalid Email ID");
		}
		
	}
}
