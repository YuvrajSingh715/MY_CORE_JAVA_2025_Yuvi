package com.yuvraj.flow.control.Iterative.Stat;

public class Employee {

	public String designation;
	public int salary;

	public Employee(String Designation, int Salary) {
		this.designation = Designation;
		this.salary = Salary;
	}

	public void setDesignation(String Designation) {
		this.designation = Designation;
	}

	public void setSalary(int Salary) {
		this.salary = Salary;
	}

	public String getDesignation() {
		return designation;
	}

	public int getSalary() {
		return salary;
	}

}
