package com.Google.langpkg.Object;

public class CloneDeepDemo implements Cloneable {

	String s1;
	String s2;

	public CloneDeepDemo(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	@Override
	public String toString() {
		return "s1 = " + s1 + " && s2 = " + s2;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		CloneDeepDemo cm1 = new CloneDeepDemo("Yegritte", "JonSnow"); // Object creation

		CloneDeepDemo cm2 = (CloneDeepDemo) cm1.clone(); // Deep cloning

		System.out.println("reference comparison between cm1 & cm2: " + (cm1 == cm2));
		System.out.println("cm1: " + cm1.hashCode() + " && " + "cm2: " + cm2.hashCode());

//		System.out.println("cm1: " + cm1);
//		System.out.println("cm2: " + cm2);

		cm1.setS1("Ned Stark");
		cm1.setS2("Catelyn Stark");
		
//		cm2.setS1("Ned Stark");
//		cm2.setS2("Catelyn Stark");

		System.out.println("cm1: " + cm1);
		System.out.println("cm2: " + cm2);

	}

}
