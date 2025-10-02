package com.persistent.operators;

public class ConditionalOperatorDemo1 {

	public static void main(String[] args) {

		int a = 21;
		int b = 11;
		int x1 = (a > b) ? 50 : 100; // if operand is true then 50 assigned inside the x1
		int x2 = (a < b) ? 50 : 100; // if operand is false then 100 assigned inside the x2
		System.out.println("final value of x1 = " + x1); //50
		System.out.println("final value of x2 = " + x2); //100

		int c = 30;
		int d = 40;
		int max = (c > d) ? c : d;
		int min = (c < d) ? c : d;
		System.out.println("Bigger number = " + max); // 40
		System.out.println("Smaller number = " + min); // 30

		int marks = 100;
		String Presult = (marks >= 33) ? "Pass" : "Fail";
		String Fresult = (marks <= 32) ? "Pass" : "Fail";
		System.out.println("Result = " + Presult); //pass
		System.out.println("Result = " + Fresult); //fail

	}

}
