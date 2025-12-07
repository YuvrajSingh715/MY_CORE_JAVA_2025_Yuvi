package com.intuit.design.pattern;

public class Jalebi {
	
	//Eager way of creating singleton
	
	private static Jalebi jalebi = new Jalebi();
	
	
	public static Jalebi getJalebi() {
		return jalebi;
	}

}
