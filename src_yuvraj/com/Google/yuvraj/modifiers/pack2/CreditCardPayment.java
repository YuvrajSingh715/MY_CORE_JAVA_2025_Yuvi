package com.Google.yuvraj.modifiers.pack2;

public class CreditCardPayment extends Payment {
    protected void validateRequest() {
        System.out.println("Validate credit card number & expiry...");
    }

    protected void processPayment() {
        System.out.println("Interacting with card gateway...");
    }
}