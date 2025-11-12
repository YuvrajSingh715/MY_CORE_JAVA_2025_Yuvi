package com.yuvraj.flow.control.selection.Stat;

public class SwitchEnhancedCodeDemo {
	
	public static void main(String[] args) {
		
		int n = 1;
		
		switch(n) {
		//  The [->] symbol can also act as a break in a switch case
		case 1 -> System.out.println("Hi Guys");
		case 2 -> System.out.println("How are you ?");
		case 3 -> System.out.println("How's going on ?");
		default -> System.out.println("invalid");   //default case is optional
		
		}
	}

}
