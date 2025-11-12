package com.yuvraj.flow.control.selection.Stat;

public class SwitchCountryCodeEx6 {

	public static void main(String[] args) {

		String C = "CA"; // You can choose IN", "US", "UK", "JP", "CA" and others

		switch (C) {

		case "US":
			System.out.println("Country Name : United States of America");
			System.out.println("Country Currency : United States Dollar");
			break;
			
		case "IN":
			System.out.println("Country Name : India");
			System.out.println("Country Currency : Indian Rupee");
			break;
			
		case "UK":
			System.out.println("Country Name : United Kingdom");
			System.out.println("Country Currency : Pound Sterling");
			break;
			
		case "JP":
			System.out.println("Country Name : Japan");
			System.err.println("Country Currency : Japanese Yen");
			break;
			
		case "CA":
			System.out.println("Country Name : Canada");
			System.out.println("Country Currency : Canadian Dollar");
			break;
			
		default:
			System.out.println("No country matches our list.");

		}
	}

}
