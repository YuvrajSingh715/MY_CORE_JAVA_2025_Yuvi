package com.intuit.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class BankClient {

	public static void main(String[] args) {

		TreeSet<Bank> bankList = new TreeSet<Bank>();
		bankList.add(new Bank("Saving", 1001L, "Yuvaraj Singh", "England", 9000000001L));
		bankList.add(new Bank("Saving", 1002L, "Rahul Sharma", "India", 9000000002L));
		bankList.add(new Bank("Current", 1003L, "Virat Kohli", "India", 9000000003L));
		bankList.add(new Bank("Saving", 1004L, "Rohit Sharma", "India", 9000000004L));
		bankList.add(new Bank("Saving", 1005L, "MS Dhoni", "India", 9000000005L));

		bankList.add(new Bank("Current", 1003L, "Abhishek Kushwah", "Canada", 9000000002L));
		bankList.add(new Bank("Saving", 1007L, "KL Rahul", "India", 9000000007L));
		bankList.add(new Bank("Saving", 1008L, "Rishabh Pant", "India", 9000000008L));
		bankList.add(new Bank("Saving", 1009L, "Jasprit Bumrah", "India", 9000000009L));
		bankList.add(new Bank("Current", 1010L, "Ravindra Jadeja", "India", 9000000010L));

		bankList.add(new Bank("Saving", 1011L, "Ashwin", "India", 9000000011L));
		bankList.add(new Bank("Saving", 1012L, "Shubman Gill", "India", 9000000012L));
		bankList.add(new Bank("Current", 1013L, "Suryakumar Yadav", "India", 9000000013L));
		bankList.add(new Bank("Saving", 1014L, "Ishan Kishan", "India", 9000000014L));
		bankList.add(new Bank("Saving", 1015L, "Ben Stokes", "England", 9000000015L));

		bankList.add(new Bank("Current", 1016L, "Joe Root", "England", 9000000016L));
		bankList.add(new Bank("Saving", 1017L, "Steve Smith", "Australia", 9000000017L));
		bankList.add(new Bank("Saving", 1018L, "David Warner", "Australia", 9000000018L));
		bankList.add(new Bank("Current", 1019L, "Kane Williamson", "New Zealand", 9000000019L));
		bankList.add(new Bank("Saving", 1020L, "AB de Villiers", "South Africa", 9000000020L));

		bankList.add(new Bank("Saving", 1021L, "Chris Gayle", "West Indies", 9000000021L));
		bankList.add(new Bank("Current", 1022L, "Andre Russell", "West Indies", 9000000022L));
		bankList.add(new Bank("Saving", 1023L, "Jos Buttler", "England", 9000000023L));
		bankList.add(new Bank("Saving", 1024L, "Jonny Bairstow", "England", 9000000024L));
		bankList.add(new Bank("Current", 1025L, "Jofra Archer", "England", 9000000025L));
		// Iterator
		/*
		 * Iterator<Bank> iterator = bankList.iterator(); while(iterator.hasNext())
		 * System.out.println(iterator.next());
		 */

		/*
		 * for (int i = 0; i < bankList.size(); i++) {
		 * System.out.println(bankList.getFirst()); } // Methods like get(i) do not
		 * exist in Set // Because TreeSet does NOT support index-based access.
		 */
		/*
		 * // Enhanced for-loop for (Bank bk : bankList) { System.out.println(bk);
		 * 
		 * }
		 */
		
		//bankList.forEach(System.out::println);
		//bankList.forEach((s) -> System.out.println(s));
		
		
		

	}

}
