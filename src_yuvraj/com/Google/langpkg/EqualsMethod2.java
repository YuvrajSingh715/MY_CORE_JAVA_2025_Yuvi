package com.Google.langpkg;

public class EqualsMethod2 {

	String name;
	int id;

	public EqualsMethod2(String name, int id) {
		this.id = id;
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {

		try {
			String name1 = this.name;
			int id1 = this.id;

			EqualsMethod2 eq2 = (EqualsMethod2) o;

			String name2 = eq2.name;
			int id2 = eq2.id;

			if (name1.equals(name2) && id1 == id2) {
				return true;
			} else {
				return false;
			}

		} catch (ClassCastException cce) {
			return false;
		} catch (NullPointerException npe) {
			return false;
		}
	}

	public static void main(String[] args) {

		EqualsMethod2 em1 = new EqualsMethod2("Black Castle", 1001);
		EqualsMethod2 em2 = new EqualsMethod2("Kings Landing", 2002);
		EqualsMethod2 em3 = new EqualsMethod2("Winterfall", 3003);
		EqualsMethod2 em5 = new EqualsMethod2("Black Castle", 1001);
		EqualsMethod2 em4 = em1;
		
		System.out.println(em1.equals(em2));
		System.out.println(em1.equals(em3));
		System.out.println(em1.equals(em5));
		System.out.println(em1.equals(em4));
		System.out.println(em1.equals("Black Castle"));
		System.out.println(em1.equals(null));
		
	}

}
