package com.intuit.java17;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employees = List.of(new Employee(1, "Amit", "IT", 60000, 30),
				new Employee(2, "Rahul", "HR", 40000, 28), new Employee(3, "Neha", "Finance", 75000, 32),
				new Employee(4, "Pooja", "IT", 50000, 26), new Employee(5, "Rohit", "Sales", 45000, 29),
				new Employee(6, "Karan", "HR", 42000, 35), new Employee(7, "Ankit", "IT", 80000, 34),
				new Employee(8, "Sneha", "Finance", 68000, 31), new Employee(9, "Vikas", "Sales", 52000, 27),
				new Employee(10, "Priya", "HR", 39000, 24), new Employee(11, "Arjun", "IT", 90000, 36),
				new Employee(12, "Nisha", "Finance", 72000, 33), new Employee(13, "Manoj", "Sales", 48000, 41),
				new Employee(14, "Ritu", "IT", 61000, 28), new Employee(15, "Deepak", "HR", 43000, 31),
				new Employee(16, "Kavya", "Finance", 77000, 29), new Employee(17, "Suresh", "Sales", 55000, 38),
				new Employee(18, "Meena", "IT", 67000, 27), new Employee(19, "Nitin", "HR", 46000, 34),
				new Employee(20, "Alok", "Finance", 82000, 40));
		employees.forEach(System.out::println);
		// Department-wise Highest Salary (Record ke saath)
		Map<String, Optional<Employee>> highestSalaryByDept = employees.stream().collect(Collectors
				.groupingBy(Employee::department, Collectors.maxBy(Comparator.comparingDouble(Employee::salary))));
		System.out.println(highestSalaryByDept);
		// IT Department ka Average Salary
		double avgItSalary = employees.stream().filter(e -> e.department().equalsIgnoreCase("IT"))
				.mapToDouble(Employee::salary).average().orElse(0.0);
		System.out.println(avgItSalary);
		// Second Highest Salary (Overall)
		Employee secondHighest = employees.stream().sorted(Comparator.comparingDouble(Employee::salary).reversed())
				.skip(1).findFirst().orElse(null);
		System.out.println(secondHighest);
		// Department-Wise Employee Count
		Map<String, Long> countByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
		System.out.println(countByDept);
		// Highest Salary Employee Overall
		Employee maxSalaryEmp = employees.stream().max(Comparator.comparingDouble(Employee::salary)).orElse(null);
		System.out.println(maxSalaryEmp);
		// Department-Wise Total Salary
		Map<String, Double> totalSalaryByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::department, Collectors.summingDouble(Employee::salary)));
		System.out.println(totalSalaryByDept);
		// Youngest Employee in Each Department
		Map<String, Optional<Employee>> yougestByDept = employees.stream().collect(
				Collectors.groupingBy(Employee::department, Collectors.minBy(Comparator.comparingInt(Employee::age))));
		System.out.println(yougestByDept);
		//IT Department ka 2nd Highest Salary
		Employee secondHighestIT =employees.stream().filter(e -> e.department().equalsIgnoreCase("IT")).sorted(Comparator.comparingDouble(Employee::salary).reversed())
		.skip(1).findFirst().orElse(null);
		System.out.println(secondHighestIT.name());
		
	}

}
