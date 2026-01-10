package collectionframework.set;

import java.util.HashSet;

public class CustomObjectTest {

	public static void main(String[] args) {

		HashSet<CustomObject> co = new HashSet<>();

		co.add(new CustomObject(01, "Data Types"));
//		co.add(new CustomObject());
		co.add(new CustomObject(02, "Arrays"));
		co.add(new CustomObject(04, "Modifiers"));
//		co.add(new CustomObject());
		co.add(new CustomObject(03, "Arrays"));
		co.add(new CustomObject(06, "Opps Concept"));
		co.add(new CustomObject(05, "Collections"));
		System.out.println(co.add(new CustomObject(06, "Collections")));
		
		co.add(new CustomObject(05, "Import Statement"));

//		System.out.print(co);
		for (CustomObject result : co) {
			System.out.println(result);
		}
		
		
		System.out.println("---------------------------------------------------");
		HashSet raw = new HashSet();
		raw.add("Hello");        // allowed
		raw.add('d');            // allowed

		raw = co; // Here is no classCastException
		HashSet<CustomObject> coco = raw;
		CustomObject obj = coco.iterator().next(); // ❌ ClassCastException
		
	}

}
