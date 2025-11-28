package com.Google.yuvraj.flow.control.selection.Stat;

public class SwitchMonthDaysEx8 {

	public static void main(String[] args) {

		byte M = 4;
		int year = 2012;

		switch (M) {

		case 1:
			System.out.println("The month is January");
			System.out.println("31 Days");
			break;

		case 2:
			System.out.println("the month is February");
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println("This is leap year 29 Days");
			} else {
				System.out.println("This is Normal year 28 Days");
			}
			break;

		case 3:
			System.out.println("the month is March");
			System.out.println("31 Days");
			break;

		case 4:
			System.out.println("the month is April");
			System.out.println("30 Days");
			break;

		case 5:
			System.out.println("the month is May");
			System.out.println("31 Days");
			break;

		case 6:
			System.out.println("the month is June");
			System.out.println("30 Days");
			break;

		case 7:
			System.out.println("the month is July");
			System.out.println("31 Days");
			break;

		case 8:
			System.out.println("the month is August");
			System.out.println("31 Days");
			break;

		case 9:
			System.out.println("the month is September");
			System.out.println("30 Days");
			break;

		case 10:
			System.out.println("the month is October");
			System.out.println("31 Days");
			break;

		case 11:
			System.out.println("the month is November");
			System.out.println("30 Days");
			break;

		case 12:
			System.out.println("the month is December");
			System.out.println("31 Days");
			break;

		default:
			System.out.println("This number doesn't contain any month");

		}
	}

}