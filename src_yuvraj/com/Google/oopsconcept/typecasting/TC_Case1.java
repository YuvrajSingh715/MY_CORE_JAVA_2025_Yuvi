package com.Google.oopsconcept.typecasting;

// type casting syntax : A a = (C) D     
//RULE-01:	relationship between C & D {child to parent & parent to child & same type}
//          otherwise we will get compile time error saying that "ClassCastException".


public class TC_Case1 {
		
	public static void main(String[] args) {
		
		Object obj = new String("Yuvi");        
		StringBuffer sb1 = (StringBuffer) obj;
//----------------------------------------------------\\	
//		Object obj = new String("YUV");        
//		String sb1 = (String) obj;
	    
		System.out.println(obj.hashCode());
		System.out.println(sb1.hashCode());
		
		
		String s = new String("Yuviii");
//		StringBuffer sb2 = (StringBuffer) s;
//	    ↪> Cannot cast from String to StringBuffer because No relationship between these classes.
		
		System.out.println(s.hashCode());
	}

}
