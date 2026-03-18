package com.Google.langpkg.String_StringBuffer_StringBuilder;

final class ImmutableClassDemo {

	final private int i;

	ImmutableClassDemo(int i) {
		this.i = i;
	}
	
	public ImmutableClassDemo changes(int i) {
		if(this.i == i) {
			return this;
		}
		return new ImmutableClassDemo(i);
	}
	
	public static void main(String[] args) {
		
		ImmutableClassDemo ic1 = new ImmutableClassDemo(121);
		ImmutableClassDemo ic2 = ic1.changes(121);
		ImmutableClassDemo ic3 = ic2.changes(221);
		
		System.out.println("ic1 == ic2: " + (ic1 == ic2));
		System.out.println("ic1: " + ic1.hashCode() +"  ||  " + "ic2: " + ic2.hashCode());
		System.out.println(System.lineSeparator());
		System.out.println("ic1 == ic3: " + (ic1 == ic3));
		System.out.println("ic1: " + ic1.hashCode() +"  ||  " + "ic3: " + ic3.hashCode());
		
	}
}
