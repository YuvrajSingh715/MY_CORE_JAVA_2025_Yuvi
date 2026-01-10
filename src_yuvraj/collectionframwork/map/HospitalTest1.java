package collectionframwork.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class HospitalTest1 {

	public static void main(String[] args) {

		// Override a Comparator using a lambda function
//		TreeMap<String, Hospital> treeMap = new TreeMap<>((a, b) -> b.compareTo(a));
		
		// Override a Comparator using an anonymous class
		TreeMap<String, Hospital> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1); // descending order
            }
        });

		treeMap.put("P261", new Hospital("Oliver", 23, "Malaria"));
		treeMap.put("P103", new Hospital("Harry", 21, "Flu"));
		treeMap.put("P043", new Hospital("Amelia", 26, "Dengue"));
		treeMap.put("P503", new Hospital("Sophie", 32, "Headache"));
		treeMap.put("P470", new Hospital(null, 0, null));
		treeMap.put("P601", new Hospital("Jack", 34, "Fever"));
//		treeMap.put(null, new Hospital("Jessica", 28, "Cough and Cold"));

		Iterator<Map.Entry<String, Hospital>> itr = treeMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Hospital> entry = itr.next();
			System.out.println("Patient ID: " + entry.getKey() + " >>->->> " + entry.getValue());
		}

	}
	
}
