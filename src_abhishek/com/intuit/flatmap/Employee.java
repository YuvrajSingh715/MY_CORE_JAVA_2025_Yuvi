package com.intuit.flatmap;

import java.util.List;

public class Employee {

	String name;
	List<String> skills;

	Employee(String name, List<String> skills) {
		this.name = name;
		this.skills = skills;
	}

	public List<String> getSkills() {
		return skills;
	}
	 public String getName() {
	        return name;

}
}
