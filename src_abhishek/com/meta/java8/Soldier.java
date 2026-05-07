package com.meta.java8;

public class Soldier {
	private int id;
	private String name;
	private String rank;
	private String unit;
	private double salary;
	private int age;
	
	public Soldier(int id, String name, String rank, String unit, double salary, int age) {
		this.id = id;
		this.name = name;
		this.rank = rank;
		this.unit = unit;
		this.salary = salary;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRank() {
		return rank;
	}
	public String getUnit() {
		return unit;
	}
	public double getSalary() {
		return salary;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return name +" - " + rank + " - " + unit + " - " + salary;
		
	}

}
