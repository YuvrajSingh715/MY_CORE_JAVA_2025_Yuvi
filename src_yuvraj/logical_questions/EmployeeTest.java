package logical_questions;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> empList = List.of(new Employee("Yuvraj", 21342.4, "IT", "Gwalior"),
				new Employee("Abhishek", 52342, "HR", "Pune"), new Employee("Rohit", 75000, "IT", "Delhi"),
				new Employee("Anjali", 68000, "HR", "Mumbai"), new Employee("Karan", 82000, "Finance", "Indore"),
				new Employee("Sneha", 91000, "Finance", "Bhopal"), new Employee("Amit", 45000, "Sales", "Jaipur"),
				new Employee("Priya", 47000, "Sales", "Nagpur"), new Employee("Rahul", 99000, "IT", "Noida"),
				new Employee("Neha", 61000, "HR", "Delhi"), new Employee("Vikas", 73000, "Finance", "Pune"),
				new Employee("Simran", 54000, "Sales", "Mumbai"), new Employee("Arjun", 88000, "IT", "Hyderabad"),
				new Employee("Pooja", 66000, "HR", "Chennai"), new Employee("Manish", 79000, "Finance", "Delhi"),
				new Employee("Kriti", 52000, "Sales", "Indore"), new Employee("Deepak", 87000, "IT", "Bangalore"),
				new Employee("Megha", 58000, "HR", "Bhopal"), new Employee("Suresh", 62000, "Finance", "Jaipur"),
				new Employee("Tina", 50000, "Sales", "Pune"));

		Map<String, Optional<Employee>> depMaxSal = empList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		System.out.println(depMaxSal);
		
		Optional<Employee> maxSalary = empList.stream().max(Comparator.comparingDouble(Employee::getSalary));
		
		System.out.println(maxSalary);
		
		double secMaxSal = empList.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null);
		
		System.out.println(secMaxSal);
		
		Optional <Employee> highPaidEmp = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		Employee hpe = highPaidEmp.get();
		          
		System.out.println(hpe.getEmpName()+ " : " +hpe.salary );
	}

}
