package com.yuvraj.oopsconcept;

public class EncapsulationDemo {

	private double balance;
	private String accountHolder;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	// constructor
	EncapsulationDemo(String accountHolder, double balance ) {
		this.balance = balance;
		this.accountHolder = accountHolder;
	}

	/*
	 * @Override public String toString() { return
	 * "Account Information = [Account Holder = " + accountHolder + ", Balance = " +
	 * balance + "]"; }
	 */

}
