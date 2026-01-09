package com.intuit.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IntegerArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(55);
		list.add(56);
		list.add(77);
		list.remove(0);

		Iterator<Integer> itr = list.iterator();

		/*
		 * while (itr.hasNext()) {
		 * 
		 * System.out.println(itr.next()); }
		 */
		while (itr.hasNext()) {
			Integer value = itr.next();
			if (value == 55) {
				//list.remove(value); // ❌ Direct modification
				itr.remove();
				System.out.println(itr.next());

			}

		}

	}
}
