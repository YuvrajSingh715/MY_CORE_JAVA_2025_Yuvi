package com.intuit.interview;

public class Employees {

	private int id;
	private String name;
	private String department;
	private double salary;
	private int age;
	private String gender;
	private int yearOfJoining;

	public Employees(int id, String name, String department, double salary, int age, String gender, int yearOfJoining) {

		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.yearOfJoining = yearOfJoining;

	}
//============================Getter======================================
	public int getId() {
		return id;
	}

	public String getName() {
		return name;

	}

	public String getDepartment() {
		return department;
	}

	public double getSalary() {
		return salary;
	}

	public int getAge() {
		return age;

	}

	public String getGender() {
		return gender;

	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}
	//=================Setter=======================================
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setSalary(double salary) {
		this.salary = salary;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setYearOfJoing(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	
	public Employees() {
		
	}

	@Override
	public String toString() {
		return "Employees [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary + ", age="
				+ age + ", gender=" + gender + ", yearOfJoining=" + yearOfJoining + "]";
	}
	
	

}
