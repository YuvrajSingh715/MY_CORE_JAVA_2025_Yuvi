package collectionframework.list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorListDemo {

	public static void main(String[] args) {

		Vector<Double> vec = new Vector<>();

		vec.add(34.2);
		vec.add(12.3);
		vec.add(4.2);
		vec.add(7.3);
		vec.add(null);
		vec.add(12.3);
		vec.add(6.2);
		vec.add(null);

		System.out.println("iterate the vector list using the iterator cursor");
		Iterator<Double> ir = vec.iterator();

		while (ir.hasNext()) {
			System.out.println(ir.next());
		}

		System.out.println("vectorlist iteration by advance for loop");
		for (Double v : vec) {
			System.out.println(v);
		}

		System.out.println("vectorlist iteration by for loop");
		for (int i = 0; i < vec.size(); i++) {
			System.out.println(vec.get(i));
		}

		System.out.println("vectorlist iteration by enumeration cursor");
		Enumeration<Double> en = vec.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

		System.out.println("vectorlist iteration by forEach method in java 8");
		vec.forEach((v1) -> {
			System.out.println(v1);
		});
	}

}
