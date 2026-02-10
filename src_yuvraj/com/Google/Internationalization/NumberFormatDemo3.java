package com.Google.Internationalization;

import java.text.NumberFormat;

public class NumberFormatDemo3 {
	
	public static void main(String[] args) {
		
		NumberFormat nf = NumberFormat.getInstance();
		
		nf.setMaximumFractionDigits(2);
		System.out.println("Only two digit after decimal: "+nf.format(2134.4534));
		System.out.println("Only two digit after decimal: "+nf.format(23444.3));
		System.out.println(System.lineSeparator());
		
		nf.setMinimumFractionDigits(2);
		System.out.println("Only two digit after decimal: "+nf.format(3423.5323));
		System.out.println("Only two digit after decimal: "+nf.format(32414.2));
		System.out.println(System.lineSeparator());
		
		nf.setMaximumIntegerDigits(3);
		System.out.println("Only two digit before decimal: " +nf.format(2342.6455));
		System.out.println("Only two digit before decimal: " +nf.format(2.432));
		System.out.println(System.lineSeparator());
		
		nf.setMinimumIntegerDigits(3);
		System.out.println("Only two digit before decimal: " +nf.format(4223.6455));
		System.out.println("Only two digit before decimal: " +nf.format(7.432));
		
	}

}
