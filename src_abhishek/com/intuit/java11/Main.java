package com.intuit.java11;

public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("Indore", "MP");
        Employee e1 = new Employee("Abhishek", 28, a1);

        // Modify original address
        a1.setCity("Delhi"); //unable to modify after implement setter in address it is working

        // Validate immutable behavior
        System.out.println(e1.getAddress().getCity());
    }
}

