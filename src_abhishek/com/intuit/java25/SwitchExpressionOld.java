package com.intuit.java25;

public class SwitchExpressionOld {

	public static void main(String[] args) {
		int day = 2;
		String result;
         //Old Switch
		switch (day) {
		case 1:
			result = "Mon";
			break;
		case 2:
			result = "Tue";
			break;

		default:
			result = "Other";

		}
		System.out.println(result);
	}

}
