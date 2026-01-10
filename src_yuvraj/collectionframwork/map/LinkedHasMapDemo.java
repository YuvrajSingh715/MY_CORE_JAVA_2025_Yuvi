package collectionframwork.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();   //insertion order is preserved

		map.put(01, "AAA");
		map.put(04, "EEE");
		map.put(04, null);
		map.put(02, "BBB");
		map.put(01, "aaa");
		map.put(null, "CCC");
		map.put(null, null);
		map.put(null, "ccc");

		map.forEach((k, v) -> System.out.println("key Part: " + k + " >->> value Part: " + v));

	}

}
