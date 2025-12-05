package com.meta.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FinalList {

	public static void main(String[] args) {
	final List<Integer> list = new ArrayList<Integer>();
	//list = new ArrayList<Integer>();
	List<Integer> list2= new ArrayList<Integer>();

	System.out.println(list2);
	list.add(22);
	list.add(100);
	list2.add(15);
	list2.add(89);
	
	
	System.out.println(list);
	List<Integer> unmofifiableList = Collections.unmodifiableList(list);
	unmofifiableList.add(11);
	//System.out.println(unmofifiableList);
	

	}

}
