package com.intuit.java11;

public class StringSplitLine {

	public static void main(String[] args) {
		String s = "A\nB\nC"; // Splits string into lines.
		s.lines().forEach(System.out::println);
		// repeat()

		// Repeats a string N times.

		System.out.println("Abhishek ".repeat(5));

		// Files.readString() and Files.writeString()

		// Before Java 11 → reading/writing required multiple lines.

	}

}
