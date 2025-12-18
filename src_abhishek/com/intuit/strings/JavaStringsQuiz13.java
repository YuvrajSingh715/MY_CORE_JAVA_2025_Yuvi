package com.intuit.strings;

public class JavaStringsQuiz13 {

	public static void main(String[] args) {
		System.out.println(String.join(", ", "1", "2", "3").concat(",").repeat(3).lastIndexOf(','));

	}

}
