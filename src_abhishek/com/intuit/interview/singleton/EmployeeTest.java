package com.intuit.interview.singleton;

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp1 = Employee.getInstance();
        Employee emp2 = Employee.getInstance();

        System.out.println(emp1 == emp2); // Output: true (same object)
        System.out.println(emp1.getName()); // Output: Abhishek
    }
}



