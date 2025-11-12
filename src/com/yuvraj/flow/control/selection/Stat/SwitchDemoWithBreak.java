package com.yuvraj.flow.control.selection.Stat;

public class SwitchDemoWithBreak {

	public static void main(String[] args) {

		int x = 2;

		switch (x) {

		case 1:
			System.out.println("Today is Monday");
			break;
		case 2:
			System.out.println("Today is Tuesday");
			break;
		case 3:
			System.out.println("Today is Wednesday");
			break;
		case 4:
			System.out.println("Today is Thursday");
			break;
		case 5:
			System.out.println("Today is Friday");
			break;
		case 6:
			System.out.println("Today is Saturday");
			break;
		case 7:
			System.out.println("Today is Sunday");
		default:
			System.out.println("You have entered the number out of range");

		}
	}
}
