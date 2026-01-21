package com.intuit.java11;

public final class Employee {

    private final String name;
    private final int age;
    private final Address address; // mutable object

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        // Defensive copy
        this.address = new Address(address.getCity(), address.getState());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        // return new copy (not original)
        return new Address(address.getCity(), address.getState());
    }
}

