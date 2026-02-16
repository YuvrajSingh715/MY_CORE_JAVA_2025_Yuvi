package com.Google.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo1 {
	
	public static void main(String[] args) {
		
		double d = 216342.436;
		
		NumberFormat nf1 = NumberFormat.getInstance(Locale.CHINESE);
		
		System.out.println("Chinese format: "+ nf1.format(d));
		
		NumberFormat nf2 = NumberFormat.getInstance(Locale.CANADA);
		
		System.out.println("Canada format: " + nf2.format(d));
		
	}

}
