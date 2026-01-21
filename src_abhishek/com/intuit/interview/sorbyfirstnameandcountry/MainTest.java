package com.intuit.interview.sorbyfirstnameandcountry;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("Rahul", "India"),
                new Employee("Amit", "India"),
                new Employee("John", "USA"),
                new Employee("Suresh", "India"),
                new Employee("Daniel", "UK")
        );

        employeeList.stream()
                .filter(e -> "India".equals(e.getCountry()))
                .sorted(Comparator.comparing(Employee::getFirstName).reversed())
                .forEach(System.out::println);
    }
}
