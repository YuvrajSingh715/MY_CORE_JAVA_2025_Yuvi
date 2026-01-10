package collectionframwork.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
public static void main(String[] args) {
		
		Map <Integer, String> map = new TreeMap<>();
		// Gives elements in sorted order based on keys.
		// Key must implement Comparable, otherwise ClassCastException will occur.
		// From Java 7 onwards, TreeMap does not allow null keys.
		// If a null key is inserted, NullPointerException will be thrown.

		
		map.put(01, "AAA");
		map.put(04, "EEE");
		map.put(04, null);
		map.put(02, "BBB");
		map.put(01, "aaa");
		map.put(03, "DDD");
//		map.put(null, "CCC");   //NPE

		for(Map.Entry<Integer, String> entry : map.entrySet()){
			System.out.println("key part: "+entry.getKey()+" >->> value part: "+entry.getValue());
		}
		
	}

}
