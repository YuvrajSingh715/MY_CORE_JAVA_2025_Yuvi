package com.intuit.java25;

public class SwitchYieldExample {

	public static void main(String[] args) {
      //Switch Expression with yield (Advanced)
		int marks = 85;

		String grade = switch (marks / 10) {
		case 10, 9 -> "A+";
		case 8 -> {
			System.out.println("Good performance");
			yield "A";
		}
		case 7 -> "B";
		case 6 -> "C";
		default -> "Fail";

		};
		System.out.println("Grade: " + grade);

	}

}
