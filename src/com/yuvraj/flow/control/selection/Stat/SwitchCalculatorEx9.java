package com.yuvraj.flow.control.selection.Stat;

public class SwitchCalculatorEx9 {

	public static void main(String[] args) {

		double n1 = 2;
		double n2 = 5;

		char ope = '*'; // we can use these opeartors inside this code [-,+,*,/]

		switch (ope) {

		case '/':
			if (n2 != 0) {
				System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
			} else {
				System.out.println("Division by zero is not allowed. in this case the answer will be infinity");
			}break;
		case '*':
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '+':
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
//		default:
//			System.out.println("Sorry this operator is not supported In this code.");

		}
	}

}
