package com.intuit.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>((a,b) -> b.compareTo(a));
		treeSet.add("Z");
		treeSet.add("X");
		treeSet.add("B");
		treeSet.add("A");
		treeSet.add("C");
		System.out.println(treeSet);

	}

}
