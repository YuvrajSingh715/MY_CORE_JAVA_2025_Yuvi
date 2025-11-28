package com.Google.yuvraj.flow.control.selection.Stat;

public class SwitchTrafficLightEx7 {

	public static void main(String[] args) {

		String T = "Red";

		switch (T) {

		case "Red":
			System.out.println("Please Stop");
			break;
		case "Yellow":
			System.out.println("Ready to Go");
			break;
		case "Green":
			System.out.println("You can Go Now");
			break;
		default:
			System.out.println("This color does not match any traffic light signal.");
		}

	}

}
