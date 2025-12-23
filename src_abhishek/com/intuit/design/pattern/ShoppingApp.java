package com.intuit.design.pattern;

public class ShoppingApp {
    public static void main(String[] args) {

        Payment payment = PaymentFactory.getPayment("UPI");
        payment.pay(5000);
    }
}
/*
 * Why Use Factory Pattern? (Interview Answer)
 * 
 * ✅ Loose coupling ✅ Centralized object creation ✅ Easy to add new
 * implementations ✅ Follows Open/Closed Principle
 * 
 * Real Projects Where It’s Used
 * 
 * Spring Framework (BeanFactory, ApplicationContext)
 * 
 * LoggerFactory (Log4j, SLF4J)
 * 
 * Notification systems (Email, SMS, Push)
 * 
 * Payment gateways
 * 
 * One-Line Interview Explanation
 * 
 * “Factory Pattern provides an interface for creating objects while hiding the
 * instantiation logic from the client.”
 */