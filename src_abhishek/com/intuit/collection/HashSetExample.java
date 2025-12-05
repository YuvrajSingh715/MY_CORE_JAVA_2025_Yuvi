package com.intuit.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {

		Set set = new HashSet<>();
		set.add(22);
		set.add(null);
		set.add("Abhishek");
		System.out.println(set);
		set.add(22);
		System.out.println(set);
		System.out.println("Size: =" + set.size());
		System.out.println("Conatins : = " + set.contains("Abhishek"));;
		set.remove(null);
		System.out.println("After removing null : " +set);
		
	}  

}
