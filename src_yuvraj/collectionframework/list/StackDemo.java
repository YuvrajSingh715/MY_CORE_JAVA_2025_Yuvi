package collectionframework.list;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {

		Stack<Integer> sd = new Stack<>();

		sd.push(null); // add the element
		sd.pop(); // remove the element
		sd.push(34);
		sd.push(null);
		sd.push(65);
		sd.push(66);
		sd.push(76);

		System.out.println(sd);
		sd.peek();
		sd.push(124);
		sd.push(32);
		sd.push(54);

		System.out.println(sd);
		System.out.println(sd.empty()); // search stack is empty or not
		System.out.println(sd.search(32)); // works in lifo (last in first out)
		System.out.println(sd.search(123));
		System.out.println(sd.peek()); // View top element

		System.out.println("=====================================> Iterator");
		Iterator<Integer> it = sd.listIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("=====================================> Enumeration");
		Enumeration<Integer> enu = sd.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

		System.out.println("=====================================> for loop");
		for (int i = 0; i < sd.size(); i++) {
			System.out.println(sd.get(i));
		}

		System.out.println("=====================================> Advance for loop");
		for (Integer num : sd) {
			System.out.println(num);
		}

		System.out.println("=====================================> forEach in java 8");
		sd.forEach((s1) -> {
			System.out.println(s1);
		});
		
	}

}
