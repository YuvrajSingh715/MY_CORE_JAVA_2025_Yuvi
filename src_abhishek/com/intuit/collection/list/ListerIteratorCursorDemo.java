package com.intuit.collection.list;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListerIteratorCursorDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		linkedList.add("Priyanka");
		linkedList.add("Pooja");
		linkedList.add("Bhupesh");
		linkedList.add("Abhishek");
		linkedList.add("Yuvi");

		System.out.println(
				"read, remove, replace(set), add operation $$ Bidirectional" + "(forward and backward) cursor");
		System.out.println(linkedList);

		ListIterator listItr = linkedList.listIterator();
		while (listItr.hasNext()) {
			String s = (String) listItr.next();
			System.out.println(listItr.previousIndex());

			if (s.equals("Bhupesh")) { // remove
				listItr.remove();

			}
			if (s.equals("Pooja")) { // set
				listItr.set("Pooja Singh");

			}
			if (s.equals("Yuvi")) { // add

				listItr.add("Yuvaraj");
			}

		}
		System.out.println(linkedList);
System.out.println(listItr.previousIndex());

	}

}
