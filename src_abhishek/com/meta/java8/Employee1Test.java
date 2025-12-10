package com.meta.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee1Test {

	public static void main(String[] args) {
		List<Employee1> employeeList = Arrays.asList(

				new Employee1("Abhishek", "Male", "Pune"), new Employee1("Lata", "Female", "Mumbai"),
				new Employee1("Shiva", "Female", "Gwalior"), new Employee1("Kanchan", "Female", "Gwalior"),
				new Employee1("Rahul", "Male", "Gwalior"), new Employee1("Amit", "Male", "Pune"),
				new Employee1("Priya", "Female", "Delhi"), new Employee1("Raju", "Male", "Pune"),
				new Employee1("Neha", "Female", "Mumbai"), new Employee1("Sushant", "Male", "Delhi"),
				new Employee1("Kiran", "Female", "Pune")

		);

		Map<String, Long> countMaleFemaleEmployee = employeeList.stream()
				.collect(Collectors.groupingBy(Employee1::getGender, Collectors.counting()));

		System.out.println(countMaleFemaleEmployee);

		Map<String, Map<String, Long>> genderWithCity = employeeList.stream().collect(Collectors
				.groupingBy(Employee1::getCity, Collectors.groupingBy(Employee1::getGender, Collectors.counting())));

		System.out.println(genderWithCity);
	}

}
