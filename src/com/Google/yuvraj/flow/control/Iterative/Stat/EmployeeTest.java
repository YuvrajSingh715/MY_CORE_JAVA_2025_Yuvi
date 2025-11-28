package com.Google.yuvraj.flow.control.Iterative.Stat;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee[] emp = new Employee[4];

		emp[0] = new Employee("DevOps", 70000);
		emp[1] = new Employee("Tester", 55000);
		emp[2] = new Employee("Backend", 60000);
		emp[3] = new Employee("Frontend", 65000);

        int size = emp.length;
		for (int I = 0; I < size; I++) {
			System.out.println("Designation: " + emp[I].getDesignation() + " :: " + "Salary: " + emp[I].getSalary());
		}
	}
}