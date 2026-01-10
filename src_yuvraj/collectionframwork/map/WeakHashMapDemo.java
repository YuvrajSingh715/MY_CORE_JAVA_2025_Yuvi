package collectionframwork.map;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) {

		Map<String, String> map = new WeakHashMap<>();

		String s1 = new String("Java");

		map.put(s1, "Programming Language");

		System.out.println("Before GC: " + map);

		s1 = null; // remove strong reference

		System.gc(); // request garbage collection

		System.out.println("After GC: " + map);

	}

}
