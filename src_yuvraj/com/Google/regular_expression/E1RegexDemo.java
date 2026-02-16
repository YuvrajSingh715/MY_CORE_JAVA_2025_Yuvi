package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E1RegexDemo {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("oi");
		Matcher m = p.matcher("oioiiioiiiiioo");

		while (m.find()) {
			System.out.println(
					"S-Index: " + m.start() + " | " + "E-Index: " + m.end() + " | " + "Matched word: " + m.group());
		}

	}

}
