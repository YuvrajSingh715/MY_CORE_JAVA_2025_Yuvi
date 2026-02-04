package com.Google.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q1ValidJavaIdentifiers {
	
	public static  void main(String[] args) {
		
		Pattern p = Pattern.compile("[$A-Za-z_][A-Za-z0-9$_]*");
		Matcher m = p.matcher("$YuvrajSingh12");
		
		if(m.matches()) {
			System.out.println("Valid Identifier");
		}else {
			System.out.println("Invalid Identifier");
		}
		
	}

}
