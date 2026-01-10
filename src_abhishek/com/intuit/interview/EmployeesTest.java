package com.intuit.interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeesTest {

	public static void main(String[] args) {

		List<Employees> employeesList = List.of(
				new Employees(101, "Abhishek", "Software Developer", 1500000, 39, "Male", 2024),
				new Employees(102, "Ramnaresh", "Medical", 1600000, 40, "Male", 2015),
				new Employees(103, "Lata", "Software Developer", 1800000, 35, "Female", 2023),
				new Employees(104, "Neha", "HR", 900000, 32, "Female", 2019),
				new Employees(105, "Rohit", "Sales", 1200000, 38, "Male", 2018),
				new Employees(106, "Amit", "Infrastructure", 2000000, 45, "Male", 2012),
				new Employees(107, "Pooja", "Account And Finance", 1700000, 36, "Female", 2020),
				new Employees(108, "Suresh", "Security And Transport", 1100000, 42, "Male", 2016),
				new Employees(109, "Kavita", "HR", 950000, 29, "Female", 2021),
				new Employees(110, "Manoj", "Sales", 1300000, 41, "Male", 2014));

		System.out.println(employeesList);

		Map<String, Optional<Employees>> highestPaidByDept = employeesList.stream().collect(Collectors
				.groupingBy(Employees::getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))

				));
		System.out.println(highestPaidByDept);
		System.out.println("✅ 1. Total Salary Expense by Department");
		// ✅ 1. Total Salary Expense by Department
		Map<String, Double> totalSalaryByDept = employeesList.stream().collect(
				Collectors.groupingBy(Employees::getDepartment, Collectors.summingDouble(Employees::getSalary)));
		System.out.println(totalSalaryByDept);
		// ✅ 2. Average Salary by Gender
		Map<String, Double> avgSalaryByGender = employeesList.stream()
				.collect(Collectors.groupingBy(Employees::getGender, Collectors.averagingDouble(Employees::getSalary)));
		System.out.println(avgSalaryByGender);
		// 3. Count Employees in Each Department
		Map<String, Long> employeeCountByDept = employeesList.stream()
				.collect(Collectors.groupingBy(Employees::getDepartment, Collectors.counting()));
		System.out.println(employeeCountByDept);
		// ✅ 4. Oldest Employee in Company
		Optional<Employees> oldestEmployee = employeesList.stream().max(Comparator.comparing(Employees::getSalary));
		// ✅ 5. Sort Employees by Salary Desc Then Age Desc
		System.out.println(oldestEmployee);
		List<Employees> sortedList = employeesList.stream().sorted(
				Comparator.comparingDouble(Employees::getSalary).reversed().thenComparing(Employees::getAge).reversed())
				.toList();
		System.out.println(oldestEmployee);

	}
}
