package collectionframework.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationCursorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<>();

		for (int i = 0; i <= 7; i++) {
			vector.addElement(i);
		}
		
		System.out.println("Only read operation $$ One directional(forward) Cursor");
		
		System.out.println(vector);

		Enumeration<Integer> enu = vector.elements();
		while (enu.hasMoreElements()) {
			Integer i = (Integer) enu.nextElement();
			{
				if (i % 2 != 0) {
					System.out.println(i);
				}

			}

		}

	}

}
