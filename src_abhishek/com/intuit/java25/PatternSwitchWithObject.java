package com.intuit.java25;

public class PatternSwitchWithObject {

	public static void main(String[] args) {
		Object obj = 10;
        //With Object + Pattern Matching (Modern Style 🔥)
		String result = switch (obj) {
		case Integer i -> "Integer :" + i;
		case String s -> "String :" + 5;
		case null -> "Null value";
		default -> "Unknown Type";

		};
		System.out.println(result);

	}

}
