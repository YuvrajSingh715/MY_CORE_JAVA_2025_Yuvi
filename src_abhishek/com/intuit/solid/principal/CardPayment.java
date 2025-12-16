package com.intuit.solid.principal;

public class CardPayment implements Payment{
	
	@Override
	public void pay(double amount) {
		System.out.println("Paid Using Card :" + amount);
	}


	public static void main(String[] args) {
		
		CardPayment card = new CardPayment();
		card.pay(34);
	}

	

}
