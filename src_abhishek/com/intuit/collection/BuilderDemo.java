package com.intuit.collection;

import com.intuit.design.pattern.User;

public class BuilderDemo {
    public static void main(String[] args) {

        User user = new User.UserBuilder("Abhishek")
                .email("abhishek@gmail.com")
                .phone("9999999999")
                .build();

        System.out.println("User created");
    }
}
/*
 * Why Builder Pattern? (Interview Points)
 * 
 * ✅ Handles many optional fields ✅ Improves readability ✅ Avoids constructor
 * overloading ✅ Creates immutable objects ✅ Thread-safe if object is immutable
 * 
 * When to Use Builder Pattern?
 * 
 * DTOs / Request objects
 * 
 * Entity creation with many fields
 * 
 * Configuration objects
 * 
 * Immutable objects
 * 
 * One-Line Interview Answer
 * 
 * “Builder Pattern is used to create complex objects step by step, allowing
 * optional parameters without constructor overloading.”
 * 
 * Bonus: Java 8+ Real Usage
 * 
 * StringBuilder
 * 
 * StringBuffer
 * 
 * Stream.builder()
 * 
 * Lombok @Builder
 * 
 * If you want:
 * 
 * Builder with Lombok
 * 
 * Builder vs Factory
 * 
 * Spring Boot real-time example
 * 
 * Immutable object explanation
 */