package collectionframwork.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMapDemo {
	
	public static void main(String[] args) {
		
		Map <Integer, String> map = new HashMap<>();  //insertion order is not preserved
		
		map.put(01, "AAA");
		map.put(04, "EEE");
		map.put(04, null);
		map.put(02, "BBB");
		map.put(01, "aaa");
		map.put(null, "CCC");
		map.put(null, null);
		map.put(null, "ccc");
		
		/*
		 There are 5 ways to iterate a Map in Java: 
		 keySet(), values(), entrySet(), Iterator, and forEach().
		 */
		
		System.out.println(map);

		
		System.out.println(System.lineSeparator());
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		System.out.println("Iterate the Map using the Iterator cursor.");
		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> ent = itr.next();
			System.out.println("Key Part: "+ent.getKey()+" | "+ "Value Part: "+ent.getValue());
		}System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		
		
		System.out.println(System.lineSeparator());
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		System.out.println("Iterate the Map using the advance for loop.");
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key Part: "+entry.getKey()+" | "+ "Value Part: "+entry.getValue());
		}System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		
		
		System.out.println(System.lineSeparator());
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		System.out.println("Iterate the Map using the forEach in java 8");
		map.forEach((k,v)-> System.out.println("Key Part: "+k+" | "+ "Value Part: "+v));
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		
		
		System.out.println(System.lineSeparator());
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		System.out.println("access all keys and value by advance for loop");
		for (Integer key : map.keySet()) {
		    System.out.println(key + " = " + map.get(key));
		}System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		
		
		System.out.println(System.lineSeparator());
		System.out.println(">->>-->>>--->>>>---->>>>><<<<<----<<<<---<<<--<<-<");
		System.out.println("access all values by advance for loop");
		for(String value : map.values()) {
			System.out.println(value);
		}
		
	}

}
