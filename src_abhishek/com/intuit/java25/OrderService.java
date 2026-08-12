package com.intuit.java25;

public class OrderService {

	public static String getMessage(OrderStatus status) {

		return switch (status) {

		case CREATED -> "Order is created";
		case PROCESSING -> "Order is being processed";
		case SHIPPED -> "Order shipped";
		case DELIVERED -> "Order delivered";
		case CANCELLED -> "Order cancelled";
		};

	}

	public static void main(String[] args) {
		/*
		 * Real Project Use Case (Very Important 🔥) 👉 Scenario: Order Status System
		 * (Microservice type)
		 */
		System.out.println(getMessage(OrderStatus.SHIPPED));

	}

}
