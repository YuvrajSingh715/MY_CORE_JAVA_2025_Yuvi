package collectionframwork.map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {

	public static void main(String[] args) {

		// TreeMap stores entries in ascending order of keys
		SortedMap<Integer, String> sort = new TreeMap<>();

		sort.put(001, "Nick");
		sort.put(004, "Noah");
		sort.put(002, "Jack");
		sort.put(005, "Mike");
		sort.put(003, null);
		sort.put(001, "Emmi"); // Modifie old key's value
		sort.put(006, "Jean");
//		sort.put(null, "Michael");   //null values allowed --> null point exception

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("SortedMap: " + sort);

		// firstKey() --> Returns the smallest key in the map
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("firstKey(): " + sort.firstKey());

		// lastKey() --> Returns the largest key in the map
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("lastKey(): "+ sort.lastKey());
		
		// headMap() --> Returns entries with keys less than 004
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("headMap(004): "+ sort.headMap(004));
		System.out.println("headMap(007): " + sort.headMap(007));
		
		
		// tailMap() --> Returns entries with keys greater than or equal to 004
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("tailMap(004): " + sort.tailMap(004));
		System.out.println("tailMap(007): " + sort.tailMap(007));
		
		// subMap() --> Returns entries with keys from 002 (inclusive) to 005 (exclusive)
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("subMap(from-002, to-005): "+ sort.subMap(002, 005));
		System.out.println("subMap(From-007, To-007): "+ sort.subMap(007, 007));
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		
	}

}

/* ___________________________
 * Key Notes (Easy to Remember)
 * ----------------------------
 * SortedMap keeps keys in sorted order
 * Sorting is based on natural order (Integer ascending order here)
 * TreeMap does not allow null keys
 * Values can be duplicated, keys cannot
 * 
 */