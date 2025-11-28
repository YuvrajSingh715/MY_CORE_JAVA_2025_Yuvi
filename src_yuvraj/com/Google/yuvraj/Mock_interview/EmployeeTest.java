package com.Google.yuvraj.Mock_interview;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");

		Employee e = new Employee(101, "Abhishek", list);

		list.add("Python"); // try to modify original list

		System.out.println(e.getSkills());  // Output: [Java]

	}

}
