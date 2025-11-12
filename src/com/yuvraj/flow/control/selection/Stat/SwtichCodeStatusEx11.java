package com.yuvraj.flow.control.selection.Stat;

public class SwtichCodeStatusEx11 {

	public static void main(String[] args) {
		
		int statusCode = 500;
		
		String test = switch(statusCode) {
		
		case 200 -> "code okay";
		case 404 -> "code not found";
		case 500 -> "Internal Server Error";
		default -> "Oops!! This status code doesn't match";
		};
		
		System.out.println("this is you code status = " + test);
	}

}
