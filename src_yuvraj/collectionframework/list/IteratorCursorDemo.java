package collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorCursorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			al.add(i);
		}

		System.out.println("read and remove operation $$ one directional(forward) cursor");
		
		System.out.println(al);

		Iterator <Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();

			if (i % 2 != 1) {
				System.out.println(i);
			} else {
				itr.remove();
			}

		}
		System.out.println(al);
	}

}
