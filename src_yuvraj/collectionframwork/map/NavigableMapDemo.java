package collectionframwork.map;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {

		// TreeMap stores entries in ascending order of keys
		NavigableMap<Integer, String> navi = new TreeMap<>();

		navi.put(10, "Orange");
		navi.put(2, "Ghost");
		navi.put(4, "User");
		navi.put(6, "Kite");
		navi.put(8, "Roots");
		navi.put(4, "Grow"); // modifie the old value of key
//		navi.put(null, "Yuvi");   //null values allowed --> null point exception

		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Accending order of keys: " + navi.keySet());
		System.out.println("Accending order of Map: " + navi);

		// lowerKey() & lowerEntry() -> greatest element < given element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("lowerKey(< 3): " + navi.lowerKey(3));
		System.out.println("lowerEntry(< 3): " + navi.lowerEntry(3));
		System.out.println("lowerKey(< 4): " + navi.lowerKey(4));
		System.out.println("lowerEntry(< 4): " + navi.lowerEntry(4));

		// floorKey() & floorEntry() -> greatest element <= given element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("floorKey(<= 4): " + navi.floorKey(4));
		System.out.println("floorEntry(<= 4): " + navi.floorEntry(4));
		System.out.println("floorKey(<= 5): " + navi.floorKey(5));
		System.out.println("floorEntry(<= 5): " + navi.floorEntry(5));

		// higherKey() & higherEntry() -> smallest element > given element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("higherKey(> 5): " + navi.higherKey(5));
		System.out.println("higherEntry(> 5): " + navi.higherEntry(5));
		System.out.println("higherKey(> 6): " + navi.higherKey(6));
		System.out.println(("higherEntry(> 6): " + navi.higherEntry(6)));

		// ceilingKey() & ceilingEntry() -> smallest element >= given element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("ceilingKey(>= 3): " + navi.ceilingKey(3));
		System.out.println("ceilingEntry(>= 3): " + navi.ceilingEntry(3));
		System.out.println("ceilingKey(>= 4): " + navi.ceilingKey(4));
		System.out.println("ceilingEntry(>= 4): " + navi.ceilingEntry(4));

		// pollFirstEntry() -> removes & returns first element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Before pollFirstEntry(): " + navi);
		System.out.println("pollFirstEntry(): " + navi.pollFirstEntry());
		System.out.println("After pollFirstEntry(): " + navi);

		// pollLastEntry() -> removes & returns last element
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Before pollLastEntry(): " + navi);
		System.out.println("pollLastEntry(): " + navi.pollLastEntry());
		System.out.println("After pollLastEntry(): " + navi);

		navi.put(2, "UniCorn");
		navi.put(10, "BasketBall");
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Sorted Navigable Map: " + navi);

		// descendingKeySet() & descendingMap -> reverse order view
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		System.out.println("Descending Order of Keys: " + navi.descendingKeySet());
		System.out.println("Descending Order of Map: " + navi.descendingMap());
		System.out.println(">->>-->>>--->>>><<<<---<<<--<<-<");
		
	}

}
