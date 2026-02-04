package com.Google.Enum;

public enum Month {

	JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;

	// Internally work like this
	// public static final Month JAN = new Month();

	public static void main(String[] args) {

		Month m = Month.JANUARY;

		System.out.println("Value of m: " + m);

	}

}
