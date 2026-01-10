package collectionframwork.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class HospitalTest {

	public static void main(String[] args) {

		Map<Hospital, String> map = new TreeMap<>();
		
		map.put(new Hospital("Stev", 20, "Cough and Cold"),"P005");
		map.put(new Hospital("Mike", 18, "Headache"),"P004");
		map.put(new Hospital("Dustin", 19, "Tuberculosis"),"P001");
		map.put(new Hospital("Mike", 18, "Fever"),"P003");
		map.put(new Hospital("Hopper", 31, "Fever"),"P006");
		map.put(new Hospital("Robin", 21, "Astma"), "P002");
		map.put(new Hospital("Max", 19, "Malaria"),"P007");
//		map.put(new Hospital(null, 19, "Malaria"),"P007");
//		map.put(new Hospital(null, 0, null),"P009");
//		map.put(null, "P008");
		
		
		Iterator <Map.Entry<Hospital,String >> itr = map.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Hospital, String> entry = itr.next();
			System.out.println(entry.getKey()+ " >->> " +"Patient ID: "+entry.getValue());
		}

	}

}
