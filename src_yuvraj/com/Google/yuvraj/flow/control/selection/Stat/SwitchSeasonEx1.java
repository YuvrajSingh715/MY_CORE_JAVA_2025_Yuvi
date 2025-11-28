package com.Google.yuvraj.flow.control.selection.Stat;

public class SwitchSeasonEx1 {

	public static void main(String[] args) {

		byte B = 5;

		switch (B) {

		case 1 + 2:
		case 1 + 3:
		case 1 + 4:
		case 1 + 5:
			if (B == 3) {
				System.out.println("This is the March month");
			} else if (B == 4) {
				System.out.println("This is the April month");
			} else if (B == 5) {
				System.out.println("This is the May month");
			} else
				System.out.println("This is the June month");
			System.out.println("And it is the Summer season");
			break;

		case 1 + 6:
		case 1 + 7:
		case 1 + 8:
		case 1 + 9:
			if (B == 7) {
				System.out.println("This is the July month");
			} else if (B == 8) {
				System.out.println("This is the August month");
			} else if (B == 9) {
				System.out.println("This is the September month");
			} else
				System.out.println("This is the October month");
			System.out.println("This is the Rainy season");
			break;

		case 2 + 9:
		case 3 + 9:
		case 1:
		case 2:
			if (B == 10 + 1) {
				System.out.println("This is the November month");
			} else if (B == 10 + 2) {
				System.out.println("This is the December month");
			} else if (B == 1) {
				System.out.println("This is the January month");
			} else
				System.out.println("This is the February month");
			System.out.println("This is the Winter season");
			break;

		}

	}

}
