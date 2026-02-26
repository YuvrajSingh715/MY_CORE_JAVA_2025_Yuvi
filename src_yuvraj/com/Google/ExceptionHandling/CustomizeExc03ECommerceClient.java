package com.Google.ExceptionHandling;

public class CustomizeExc03ECommerceClient {

	public static void main(String[] args) {

		int stock = 7;

		if (stock <= 0) {
			throw new CustomizeExc03ECommerce("Product is not available.");
		} else {
			System.out.println("Product is available.");
		}
	}
}
