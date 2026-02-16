package com.Google.Internationalization;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatDemo2 {
	
	public static void main(String[] args) {
		
		long l = 234543453l;
		
		Locale india = new Locale("pa" , "IN");
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(india);
		System.out.println("India Notation is -> "+ nf1.format(l));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US Notation is -> " + nf2.format(l));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.GERMANY);
		System.out.println("Germany Notation is -> " + nf3.format(l));
		
	}

}
