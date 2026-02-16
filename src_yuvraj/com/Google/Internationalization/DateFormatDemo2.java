package com.Google.Internationalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo2 {
	
	public static void main(String[] args) {
		
		DateFormat df1 =  DateFormat.getDateInstance(0, Locale.CHINA);
		System.out.println("China's Date Format: "+df1.format(new Date()));
		
		DateFormat df2 = DateFormat.getDateInstance(1, Locale.KOREAN);
		System.out.println("Korean's Date Format: "+df2.format(new Date()));
		
		DateFormat df3 = DateFormat.getDateInstance(2, Locale.UK); 
		System.out.println("UK's Date Format: " + df3.format(new Date()));
		
		DateFormat df4 = DateFormat.getDateInstance(3, Locale.GERMAN);
		System.out.println("German's Date Format: " + df4.format(new Date()));
		
		System.out.println("Italy's Date Format: " + DateFormat.getDateTimeInstance(0,0, Locale.JAPANESE).format(new Date()));
		//getDateTimeInstance(int dateStyle, int timeStyle, Locale aLocale);
		
	}

}
