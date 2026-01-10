package collectionframework.list;

import java.util.*;

public class ListIteratorCursorDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add("Priyanka");
		l.add("Pooja");
		l.add("Bhupesh");
		l.add("Abhishek");
		l.add("Yuvi");
		
		System.out.println("read, remove, replace(set), add operation $$ Bidirectional"
				+ "(forward and backward) cursor");

		System.out.println(l);

		ListIterator litr = l.listIterator();
		while (litr.hasNext()) {
			String s = (String) litr.next();
//			System.out.println(litr.previousIndex());

			if (s.equals("Bhupesh")) { // remove
				litr.remove();
			}
			if (s.equals("Pooja")) { // set
				litr.set("Pooja Singh");
			}
			if (s.equals("Yuvi")) { // add
				litr.add("Yuvraj");
			}

		}
		System.out.println(l);
//		System.out.println(litr.previousIndex());
	}
}
