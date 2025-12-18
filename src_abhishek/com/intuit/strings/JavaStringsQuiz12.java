package com.intuit.strings;

public class JavaStringsQuiz12 {

	public static void main(String[] args) {
	StringBuffer str1 = new StringBuffer("11111"); 
	StringBuffer str2 = str1.append("22222").reverse();
	System.out.println(str1 == str2);

	}

}
