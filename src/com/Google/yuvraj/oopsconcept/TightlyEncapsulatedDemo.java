package com.Google.yuvraj.oopsconcept;

public class TightlyEncapsulatedDemo {

	private int balance = 599999;

	public int getBalance() {
		return balance;
	}

	public static void main(String[] args) {

		TightlyEncapsulatedDemo tep = new TightlyEncapsulatedDemo();
		System.out.println("this is your account balance = " + tep.balance);

	}

}
