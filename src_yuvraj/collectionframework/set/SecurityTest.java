package collectionframework.set;

import java.util.HashSet;
import java.util.Iterator;

public class SecurityTest {

	public static void main(String[] args) {

		HashSet<Security> security = new HashSet<>();

		security.add(new Security("yuvraj21", "12@yuvi"));
		security.add(new Security("abhi31", "12@yuvi"));
		security.add(new Security("yuvraj21", "12@yuvi")); // duplicate
		security.add(new Security("yuvraj21", "12@abhi"));
		
		security.add(new Security("bhup2esh42", "bhupi@34"));
		security.add(new Security("32abhishek", "abhi@312"));
		security.add(new Security("poo21ja", "#pooja22"));
		security.add(new Security("nam63an", "naman$23"));
		security.add(new Security("priy97anka", "priya%382"));
		security.add(new Security("6jyoti1", "%0%jyoti"));

		Iterator<Security> itr = security.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
