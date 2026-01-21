package com.intuit.interview.singleton;

public class Employee {

    // Step 1: Create a private static instance
    private static Employee instance;

    // Example fields
    private int id;
    private String name;

    // Step 2: Private constructor (prevents direct object creation)
    private Employee() {
        this.id = 101;
        this.name = "Abhishek";
    }

    // Step 3: Public static method to return the single instance
    public static Employee getInstance() {
        if (instance == null) {
            instance = new Employee();
        }
        return instance;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

