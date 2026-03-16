package com.Google.langpkg.Object;

public class CloneMethod1 implements Cloneable{

	int x = 16;
	int y = 21;
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		CloneMethod1 cm1 = new CloneMethod1();
		
		CloneMethod1 cm2 = (CloneMethod1) cm1.clone();
		
		cm2.x = 42;
		cm2.y = 75;
		
		System.out.println(cm1.x +"  "+cm1.y);
		System.out.println(cm2.x +"  "+cm2.y);
		System.out.println(cm1 == cm2);
		System.out.println(cm1.hashCode() == cm2.hashCode());
		
	}
	
}
