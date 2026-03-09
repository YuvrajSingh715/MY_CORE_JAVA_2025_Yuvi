package com.Google.langpkg;

public class HashCodeMethod2 {

	int rollNum;

	public HashCodeMethod2(int rollNum) {
		this.rollNum = rollNum;
	}

	@Override
	public int hashCode() {
		return rollNum;
	}

	@Override
	public String toString() {
		return "HashCodeMethod2";
	}
	
	public static void main(String[] args) {
		
		HashCodeMethod2 hc1 = new HashCodeMethod2(1001001);
		HashCodeMethod2 hc2 = new HashCodeMethod2(2002001);
		
		//hashCode() calling
		System.out.println("HashCode of hc1: "+ hc1.hashCode());
		System.out.println("HashCode of hc2: "+ hc2.hashCode());
		
		//toString() calling
		System.out.println(hc1);
		System.out.println(hc2.toString());
		
	}
	
}
