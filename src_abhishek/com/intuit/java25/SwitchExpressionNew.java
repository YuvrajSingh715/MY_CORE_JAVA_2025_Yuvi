package com.intuit.java25;

public class SwitchExpressionNew {

	public static void main(String[] args) {
         //New Way
		int day = 2;

		String result = switch (day) {
		case 1 -> "Mon";
		case 2 -> "Tue";
		default -> "Other";

		};
		System.out.println(result);

	}

}
