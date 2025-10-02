package com.persistent.operators;

public class CompoundAssignmentOperatorDemo3 {

	public static void main(String[] args) {

		int number = 100;

		number -= 50; // number = number-50 → 100-50 = 50

		number += 25; // number = number+25 → 50+25 = 75

		number *= 2; // number = number*2 → 75*2 = 150

		number /= 10; // number = number/10 → 150/10 =15

		number %= 4; // number = number%4 → 15%4 = 3

		System.out.println("Number = " + number);

		

	}

}
