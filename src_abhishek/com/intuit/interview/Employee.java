package com.intuit.interview;

public class Employee {

	private int id;
	private String name;

	Employee() {
		System.out.println("O Argument constructor");
	}

	Employee(int id) {
		this.id = id;
		System.out.println("one argument constructor");
     }
	Employee(int id, String name){
		this.id = id;
		this.name = name;
		System.out.println("two argument constructor");
	}
	
	public static void main(String[] args) {
		 new Employee();
		 new Employee(12);
		 new Employee(23,"Abhishek");
		
	}

}
