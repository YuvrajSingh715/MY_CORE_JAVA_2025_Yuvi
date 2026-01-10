package collectionframework.set;

import java.util.Iterator;
import java.util.*;

public class TreeSetSecurityTest {

	public static void main(String[] args) {

		TreeSet<TreeSetSecurity> security = new TreeSet<>();

		security.add(new TreeSetSecurity("yuvraj21", "12@yuvi"));
		security.add(new TreeSetSecurity("abhi31", "12@yuvi"));
		security.add(new TreeSetSecurity("yuvraj21", "12@yuvi")); // duplicate
		security.add(new TreeSetSecurity("yuvraj21", "12@abhi"));

		security.add(new TreeSetSecurity("bhup2esh42", "bhupi@34"));
		security.add(new TreeSetSecurity("32abhishek", "abhi@312"));
		security.add(new TreeSetSecurity("poo21ja", "#pooja22"));
		security.add(new TreeSetSecurity("nam63an", "naman$23"));
		security.add(new TreeSetSecurity("priy97anka", "priya%382"));
		security.add(new TreeSetSecurity("6jyoti1", "%0%jyoti"));

		Iterator<TreeSetSecurity> itr = security.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
