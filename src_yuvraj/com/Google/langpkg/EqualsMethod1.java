package com.Google.langpkg;

public class EqualsMethod1 {

	String name;
	int id;

	public EqualsMethod1(String name, int id) {
		this.id = id;
		this.name = name;
	}

	public static void main(String[] args) {

		EqualsMethod1 em1 = new EqualsMethod1("Branden", 001);
		EqualsMethod1 em2 = new EqualsMethod1("Aryaa", 002);
		EqualsMethod1 em3 = new EqualsMethod1("Sansa", 003);
		EqualsMethod1 em4 = em1;

		System.out.println(em1.equals(em2));
		System.out.println(em1.equals(em3));
		System.out.println(em1.equals(em4));
		System.out.println(em4.equals(em1));
		
	}
}
