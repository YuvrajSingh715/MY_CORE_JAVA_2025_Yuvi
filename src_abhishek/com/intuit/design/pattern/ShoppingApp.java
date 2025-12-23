package com.intuit.design.pattern;

public class ShoppingApp {
    public static void main(String[] args) {

        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(5000);
    }
}

