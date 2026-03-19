package com.intuit.interview;

import java.util.List;

class Item {
    String itemId;
    double price;
    int quantity;

    public Item(String itemId, double price, int quantity) {
        this.itemId = itemId;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

class Tray {
    List<Item> items;

    public Tray(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }
}

class Cart {
    String cartId;
    List<Tray> trays;

    public Cart(String cartId, List<Tray> trays) {
        this.cartId = cartId;
        this.trays = trays;
    }

    public String getCartId() {
        return cartId;
    }

    public List<Tray> getTrays() {
        return trays;
    }
}
