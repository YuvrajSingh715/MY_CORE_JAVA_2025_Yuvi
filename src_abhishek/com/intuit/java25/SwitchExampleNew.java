package com.intuit.java25;

public class SwitchExampleNew {

	public static void main(String[] args) {

		int day = 3;

		String result = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		case 3 -> "Wednesday";
		case 4, 5 -> "Mid Week";
		default -> "Invalid Day";
		};

		System.out.println(result);
	}
}
/*
 * समझो (Important Points) -> use होता है (no break needed) Multiple cases एक
 * साथ: case 4, 5 Direct value return कर सकता है
 */