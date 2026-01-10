package collectionframework.list;


import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Character> ll = new LinkedList<>();

		ll.add('a');
		ll.add('b');
		ll.add('c');
		ll.add('c');
		ll.add(null);
		ll.add('a');
		ll.add('b');
		ll.add(null);

		System.out.println("++++++++++++> Iterator <+++++++++++++");
		Iterator<Character> iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("++++++++++++> for loop <+++++++++++++");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		System.out.println("++++++++++++> advance for loop <+++++++++++++");
		for (Character res : ll) {
			System.out.println(res);
		}

		System.out.println("++++++++++++> forEach in java 8 <+++++++++++++");
		ll.forEach((result) -> {
			System.out.println(result);
		});

	}

}
