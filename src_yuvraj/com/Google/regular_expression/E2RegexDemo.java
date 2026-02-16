package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E2RegexDemo {

	public static void main(String[] args) {
		
//		String x = "[a-j]";          //Characters between a to j
		String x = "[^a-j]";         //Except a to j
//		String x = "[0-9]";          //Only for Numerical numbers
//		String x = "[A-Z]";          //Only for Capital characters
//		String x = "[a-z0-9A-Z]";    //For all characters and numbers
		
		Pattern p = Pattern.compile(x);
		
		Matcher m = p.matcher("ag5Eh@jdf#jFWA12hYg3j%3");
		
		while(m.find()){
			System.out.println("S-Index: "+m.start()+" >->> "+ "Matched word: "+m.group());
		}
		
	}
}
