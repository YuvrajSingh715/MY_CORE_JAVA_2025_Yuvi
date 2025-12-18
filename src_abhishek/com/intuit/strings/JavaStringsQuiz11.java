package com.intuit.strings;

public class JavaStringsQuiz11 {

	public static void main(String[] args) {
		String str1 = "Java";
		String str2 = str1.intern();
		String str3 = new String("Java");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str2 == str3); // Confusition
		System.out.println(str1 == str3); // Confusition

	}

}
