package com.Google.yuvraj.flow.control.Iterative.Stat;

public class TaskEmployeeForLoopDemo {

	public static void main(String[] args) {

		String[] Emp = { "Name", "ID", "Department", "Designation", "Salary", "Email", "Phone Number", "Laptop",
				"Projects", "Location" };

		String[] Info = { "Yuvraj", "642374", "Frontend", "DevOps Engineer", "50000", "kushwahyuvraj262@gmail.com",
				"7697187555", "Lenovo", "Java Discussion", "Pune Maharashtra" };

		int x = Emp.length;

		for (int i = 0; i < x; i++) {
			System.out.println(Emp[i] + " :: " + Info[i]);
		}
	}

}
