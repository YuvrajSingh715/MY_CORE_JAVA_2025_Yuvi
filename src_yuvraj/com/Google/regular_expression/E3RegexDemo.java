package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E3RegexDemo {

	public static void main(String[] args) {
		  
		String x = "[\s]";        //for space character
//		String x = "[\\d]";       //for digit
//		String x = "[\\w]";       //for numbers and characters
//		String x = ".";           //for numbers, symbole and characters
		 
		Pattern p = Pattern.compile(x);
		
		Matcher m = p.matcher("ag5Eh@j df#jFW A12hYg3 j%3");
		
		while(m.find()) {
			System.out.println("S-Index: "+m.start()+" >->> "+ "Matched word: "+m.group());
		}
	}
}
