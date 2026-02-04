package com.Google.regular_expression;

import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class E5RegexDemo {
	
	public static void main(String[] args) {
		
		/*
		 * Pattern p = Pattern.compile("\\s"); 
		 * String[] s = p.split("Yuvraj Bakery Shop");
		 * for(String s1:s){ 
		 *     System.out.println(s1); 
		 *  }
		 */
		
		//Recommended way for spliting
		String s = "YUVRAJ SINGH KUSHWAH";
		String[] s1 = s.split(" ");
		
		for(String s2:s1) {
			System.out.println(s2);
		}
		
		//Spliting by StringTonkenizer
		StringTokenizer st = new StringTokenizer("1,00,000,0000", ",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
