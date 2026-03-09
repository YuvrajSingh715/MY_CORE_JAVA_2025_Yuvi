package com.Google.langpkg;

public class HashCodeMethod1 {

	long mobNumber;

	public HashCodeMethod1(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	@Override
	public int hashCode() {
		return (int) mobNumber;
	}

	public static void main(String[] args) {

		HashCodeMethod1 hsm1 = new HashCodeMethod1(1257945785);
		HashCodeMethod1 hsm2 = new HashCodeMethod1(2147483647);
		
		//hashCode() Calling
		System.out.println("HashCode of hsm1: " + hsm1.hashCode());
		System.out.println("HashCode of hsm2: " + hsm2.hashCode());
		
		//toString() Calling
		System.out.println(hsm1);
		System.out.println(hsm2);

	}

}
