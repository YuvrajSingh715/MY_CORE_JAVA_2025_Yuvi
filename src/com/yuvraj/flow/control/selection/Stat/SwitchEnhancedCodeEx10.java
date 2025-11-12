package com.yuvraj.flow.control.selection.Stat;

public class SwitchEnhancedCodeEx10 {

	public static void main(String[] args) {

		byte d = 4;

		switch (d) {

		case 1 -> System.out.println("One");
		case 2 -> System.out.println("Two");
		case 3 -> System.out.println("Three");
		case 4 -> System.out.println("Four");
		case 5 -> System.out.println("Five");
		default -> System.out.println("Invalid");
		}
	}

}
