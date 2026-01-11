package com.intuit.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(01, "Abhishek"));
		emp.add(new Employee(02, "Lata"));
		emp.add(new Employee(03, "Yuvraj"));
		emp.add(new Employee(01, "Kartik"));
		emp.add(new Employee(0, null));
		emp.add(null);

		Iterator<Employee> iterator = emp.iterator();

		System.out.println("|++++++++++++ Iterate list by the help of while loop < ++++++++++|");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("|=====================> Iterate list by the help of for <==============|");

		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp.get(i));

		}
		System.out.println("|=====================> Iterate list in reverse by for loop <==============|");

		for (int i = emp.size() - 1; i >= 0; i--) {
			System.out.println(emp.get(i));
		}

		System.out.println("|+++++++++++++++ Iterate list by the help of advance for <+++++++++++++|");
		for (Employee e : emp) {

			System.out.println(e);
		}
		System.out.println("|++++++++++++++++Iterate list by the help of forEach +++++++++++++++");
		emp.forEach((e1) -> {
			System.out.println(e1);
		});
		System.out.println("|++++++++++++ Iterate list by the help of ListIterator (Forward) ++++++++++++|");

		ListIterator<Employee> listIt = emp.listIterator();
		while (listIt.hasNext()) {
			System.out.println(listIt.next());
		}

		System.out.println("|++++++++++++ Iterate list by the help of ListIterator (Backward) ++++++++++++|");

		ListIterator<Employee> revListIt = emp.listIterator(emp.size());
		while (revListIt.hasPrevious()) {
			System.out.println(revListIt.previous());
		}

		System.out.println("|++++++++++++ Iterate list by the help of forEachRemaining (Iterator) ++++++++++++|");

		Iterator<Employee> it2 = emp.iterator();
		it2.forEachRemaining(e -> {
			System.out.println(e);
		});

		System.out.println("|++++++++++++ Iterate list by the help of Stream API ++++++++++++|");

		emp.stream().forEach(e -> {
			System.out.println(e);
		});

		System.out.println("|++++++++++++ Iterate list by the help of Parallel Stream ++++++++++++|");

		emp.parallelStream().forEach(e -> {
			System.out.println(e);
		});

		System.out.println("|++++++++++++ Print full list directly (toString) ++++++++++++|");

		System.out.println(emp);

		/*
		 ========================= NOTES ===============================

		 ✔ VALID Iteration methods for ArrayList:
		    1. while + Iterator
		    2. for loop (index based)
		    3. reverse for loop
		    4. enhanced for loop
		    5. forEach() (Java 8)
		    6. ListIterator (forward)
		    7. ListIterator (backward)
		    8. Iterator.forEachRemaining()
		    9. stream().forEach()
		   10. parallelStream().forEach()
		   11. System.out.println(list)

		 ⚠ CONDITIONALLY VALID:
		    - Enumeration (Only works directly with Vector, not ArrayList)

		 ❌ INVALID / NOT RECOMMENDED:
		    - Removing elements inside enhanced for loop → ConcurrentModificationException
		      Example wrong:
		         for(String s : list) {
		             list.remove(s); // ❌
		         }

		 ===============================================================
		*/
	}
}
