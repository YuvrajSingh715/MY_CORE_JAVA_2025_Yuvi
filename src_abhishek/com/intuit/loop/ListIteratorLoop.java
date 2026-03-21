package com.intuit.loop;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorLoop {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C");
		ListIterator<String> it = list.listIterator();
		System.out.println("--------------Forward--------------");
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		System.out.println("--------------Previous--------------");
		while (it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
