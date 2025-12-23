package com.intuit.design.pattern;

public class PaymentFactory {

    public static Payment getPayment(String type) {

        if (type.equalsIgnoreCase("CREDIT")) {
            return new CreditCardPayment();
        } else if (type.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        } else if (type.equalsIgnoreCase("NETBANKING")) {
            return new NetBankingPayment();
        }

        throw new IllegalArgumentException("Invalid payment type");
    }
}
