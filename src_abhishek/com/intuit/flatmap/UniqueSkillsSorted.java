package com.intuit.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSkillsSorted {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Abhishek", Arrays.asList("Java", "Spring", "AWS")),
				new Employee("Ravi", Arrays.asList("Docker", "Java", "Kubernetes")),
				new Employee("Neha", Arrays.asList("Spring", "Microservices","Java")));
	
		// flatmap implementation
		List<String> uniqueSkills = employees.stream().flatMap(emp -> emp.getSkills().stream()).distinct().sorted()
				.collect(Collectors.toList());
		System.out.println("Unique Sorted Skills :");
		uniqueSkills.forEach(System.out::println);
	}

}

