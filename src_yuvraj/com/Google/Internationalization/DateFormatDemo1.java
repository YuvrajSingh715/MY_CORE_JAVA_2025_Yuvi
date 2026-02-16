package com.Google.Internationalization;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatDemo1 {

	public static void main(String[] args) {
		
		//Similar to Medium format
//		System.out.println("Date format : " + DateFormat.getDateInstance().format(new Date()));

		DateFormat df = DateFormat.getDateInstance(0);
		System.out.println("Full Format of Date : " + df.format(new Date()));
		// Both are similar to create a date class object
//		System.out.println("Full Format of Date : " + DateFormat.getDateInstance(0).format(new Date()));
		
		System.out.println("Long Format of Date : " + DateFormat.getDateInstance(1).format(new Date()));
		
		System.out.println("Medium Format of Date : " + DateFormat.getDateInstance(2).format(new Date()));
		
		System.out.println("Short Format of Date : " + DateFormat.getDateInstance(3).format(new Date()));

	}

}
