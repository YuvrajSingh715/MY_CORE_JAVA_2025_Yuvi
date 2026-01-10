package collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList arrayList = new ArrayList();
		List l = Collections.synchronizedList(arrayList);

		arrayList.add("yuvi");
		arrayList.add(34);
		arrayList.add('a');
		System.out.println(arrayList);
		System.out.println("+++++++++++++++++++++++");
		
		arrayList.remove(2); // remove by the index base
		System.out.println(arrayList);
		System.out.println("+++++++++++++++++++++++");

		arrayList.add(41.4);
		arrayList.add(null);
		arrayList.add(2, "xyz");
		System.out.println(arrayList);
		System.out.println("+++++++++++++++++++++++");

		arrayList.add('f');
		arrayList.add(null);
		System.out.println(arrayList);
		System.out.println("+++++++++++++++++++++++");

		arrayList.addAll(arrayList);
		System.out.println(arrayList);
		System.out.println("+++++++++++++++++++++++");

		System.out.println(arrayList.size());
		System.out.println("+++++++++++++++++++++++");

		arrayList.clear();
		System.out.println(arrayList);

	}

}
