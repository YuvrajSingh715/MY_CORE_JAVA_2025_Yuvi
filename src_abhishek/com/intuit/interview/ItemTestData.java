package com.intuit.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemTestData {

	public static void main(String[] args) {

		// Create 25 Items
		List<Item> items = Arrays.asList(new Item("I001", 100.0, 2), new Item("I002", 250.5, 1),
				new Item("I003", 75.0, 5), new Item("I004", 300.0, 3), new Item("I005", 120.0, 4),

				new Item("I006", 500.0, 1), new Item("I007", 60.0, 6), new Item("I008", 45.5, 10),
				new Item("I009", 89.99, 7), new Item("I010", 150.0, 2),

				new Item("I011", 210.0, 3), new Item("I012", 340.0, 2), new Item("I013", 15.0, 20),
				new Item("I014", 99.0, 8), new Item("I015", 450.0, 1),

				new Item("I016", 75.5, 5), new Item("I017", 33.0, 12), new Item("I018", 199.0, 4),
				new Item("I019", 1200.0, 1), new Item("I020", 2500.0, 1),

				new Item("I021", 5.0, 50), new Item("I022", 18.0, 15), new Item("I023", 275.0, 3),
				new Item("I024", 600.0, 2), new Item("I025", 80.0, 9));

		// Create Trays
		Tray tray1 = new Tray(items.subList(0, 5));
		Tray tray2 = new Tray(items.subList(5, 10));
		Tray tray3 = new Tray(items.subList(10, 15));
		Tray tray4 = new Tray(items.subList(15, 20));
		Tray tray5 = new Tray(items.subList(20, 25));

		// Create Carts
		Cart cart1 = new Cart("CART-1", Arrays.asList(tray1, tray2));
		Cart cart2 = new Cart("CART-2", Arrays.asList(tray3));
		Cart cart3 = new Cart("CART-3", Arrays.asList(tray4, tray5));

		List<Cart> listOfCarts = Arrays.asList(cart1, cart2, cart3);

		// Stream Implementation: Calculate total per cart
		Map<String, Double> totalCartPrice = listOfCarts.stream().collect(Collectors.toMap(Cart::getCartId, cart -> cart
				.getTrays().stream().flatMap(tray -> tray.getItems().stream()).mapToDouble(Item::getTotalPrice).sum()));

		// Print Result
		totalCartPrice.forEach((k, v) -> System.out.println(k + " -> " + v));
	}
}
