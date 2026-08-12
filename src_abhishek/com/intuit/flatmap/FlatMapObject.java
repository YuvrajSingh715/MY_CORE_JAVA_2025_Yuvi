package com.intuit.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapObject {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Abhishek", Arrays.asList("Java", "Spring")),
				new Employee("Ravi", Arrays.asList("AWS", "Docker"))

		);

		List<String> skills = employees.stream().flatMap(emp -> emp.getSkills().stream()).collect(Collectors.toList());
		System.out.println(skills);
	}

}
