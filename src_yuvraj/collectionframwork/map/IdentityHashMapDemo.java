package collectionframwork.map;

import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] agrs) {

		Map<String, String> map = new IdentityHashMap<>();

		String key1 = new String("Yuvi");
		String key2 = new String("Yuvi");

		// equals() → compares content
		System.out.println("Content Comparison: " + key1.equals(key2));
		// '==' → compares reference
		System.out.println("Reference Comparison: " + (key1 == key2));

		map.put(key1, "1st value");
		map.put(key2, "2nd value");

		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " >->> Value: " + entry.getValue());
		}
		
		System.out.println("Map Size: "+map.size());
	}

}
