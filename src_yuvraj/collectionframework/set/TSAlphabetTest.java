package collectionframework.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TSAlphabetTest {

	public static void main(String[] args) {

		TreeSet<TSAlphabet> alpha = new TreeSet<>(new TSAlphabet());  		
		
		/*
		 Ham new object isliye de rahe hai taki iske pass new object add karne ke time
		 par already ek object ho jisse ham usko compare kara sake because isme
		 comparator use kiya gya hai.
	    */
		
		alpha.add(new TSAlphabet('Y', "Yuvraj", 'J'));
		alpha.add(new TSAlphabet('Y', "Yuvi", 'I'));
		alpha.add(new TSAlphabet('Y', "Yuvi", 'i'));
		alpha.add(new TSAlphabet('Y', "Yashraj", 'J'));
		alpha.add(new TSAlphabet('Y', "Yuvraj", 'J')); // duplicate
		
		alpha.add(new TSAlphabet('A', "Abhishek", 'K'));
		alpha.add(new TSAlphabet('N', "Naman", 'N'));
		alpha.add(new TSAlphabet('B', "Bhupesh", 'H'));
		alpha.add(new TSAlphabet('P', "Priyanka", 'A'));
		alpha.add(new TSAlphabet('P', "Pooja", 'A'));
		alpha.add(new TSAlphabet('J', "Jyoti", 'I'));

		Iterator<TSAlphabet> itr = alpha.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
