package com.Google.yuvraj.modifiers.pack2;

public abstract class Payment {
    
    public void doPayment() {
        validateRequest();
        processPayment();
        generateTransactionId();
        sendNotification();
    }

    protected abstract void validateRequest();
    protected abstract void processPayment();

    protected void generateTransactionId() {
        System.out.println("TXN-ID generated...");
    }

    protected void sendNotification() {
        System.out.println("Receipt sent...");
    }
}
