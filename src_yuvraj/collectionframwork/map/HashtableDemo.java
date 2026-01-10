package collectionframwork.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {

	public static void main(String[] args) {

		Map <Integer, String> hashTable = new Hashtable<>();
		//Null is not allowed for both key and value otherwise we will get NPException.
		
		hashTable.put(1, "Mango");
		hashTable.put(3, "Grapes");
		hashTable.put(1, "Cherry");
		hashTable.put(2, "Banana");
		hashTable.put(4, "Orange");
//		hashTable.put(5, null);
//		hashTable.put(null, "Apple");
		
		// Accessing value
		System.out.println(">->>-->>>--->>>><><<<<---<<<--<<-<");
		System.out.println("Value of first key: "+ hashTable.get(1));
		System.out.println("Value of sixth key: "+ hashTable.get(6));
		
		// Checking key
		System.out.println(">->>-->>>--->>>><><<<<---<<<--<<-<");
		System.out.println("Contains forth key: "+hashTable.containsKey(4));
		System.out.println("Contains sixth key: "+hashTable.containsKey(6));
		
		// Checking value
		System.out.println(">->>-->>>--->>>><><<<<---<<<--<<-<");
		System.out.println("Contains Cherry value: "+hashTable.containsValue("Cherry"));
		System.out.println("Contains WaterMelon value: "+hashTable.containsValue("WaterMelon"));
		
		// Iteration
		System.out.println(">->>-->>>--->>>><><<<<---<<<--<<-<");
		for(Map.Entry<Integer, String> entry : hashTable.entrySet()) {
			System.out.println("key: "+entry.getKey()+" <<>--<>> value: "+entry.getValue());
		}System.out.println(">->>-->>>--->>>><><<<<---<<<--<<-<");
	
	}

}
