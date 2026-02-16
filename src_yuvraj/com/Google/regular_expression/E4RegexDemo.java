package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E4RegexDemo {

	public static void main(String[] args) {

		   String x = "a"; // matches exactly one 'a'
		// String x = "a+"; // matches one or more consecutive 'a's
		// String x = "a*"; // matches zero or more 'a's (including empty string)
		// String x = "a?"; // matches zero or one 'a'

		Pattern p = Pattern.compile(x);
		Matcher m = p.matcher("abaabaaabaaaabaa");

		while (m.find()) {
			System.out.println("S-Index: " + m.start() + " >->> " + "Matched word: " + m.group());
		}
	}
}
