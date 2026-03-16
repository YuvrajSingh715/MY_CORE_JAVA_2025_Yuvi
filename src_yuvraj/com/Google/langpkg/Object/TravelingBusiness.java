package com.Google.langpkg.Object;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TravelingBusiness {

	public static void main(String[] args) {

		HashMap<Traveling, String> map = new HashMap<>();

//		Traveling t1 = new Traveling(421, "$572");
//		map.put(t1, "Indonasia");
		
		map.put(new Traveling(101, "$500"), "UAE");
		map.put(new Traveling(102, "$700"), "Vietnam");
		map.put(new Traveling(103, "$900"), "Dubai");
		map.put(new Traveling(104, "$650"), "Thailand");
		map.put(new Traveling(105, "$1200"), "Singapore");
		map.put(new Traveling(105, "$1200"), "Japan");
		map.put(new Traveling(106, "$300"), "Nepal");
		map.put(new Traveling(106, "$450"), "Bhutan");
		map.put(new Traveling(0, null), "USA");
		map.put(new Traveling(0, null), "Canada");
		map.put(new Traveling(301, null), "Itly");
		

		Iterator<Map.Entry<Traveling, String>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<Traveling, String> result = itr.next();
			System.out.println(result.getKey() + " && Country: " + result.getValue());
		}
		
	}
	
}
