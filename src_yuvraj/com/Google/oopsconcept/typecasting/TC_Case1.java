package com.Google.oopsconcept.typecasting;

public class TC_Case1 {
	
// RULE-01:	relationship between classes {child to parent & parent to child}
	
	public static void main(String[] args) {
		
//		Object obj = new String("Yuvi");        
//		StringBuffer sb1 = (StringBuffer) obj;
//----------------------------------------------------\\	
		Object obj = new StringBuffer("Yuvi");        
		StringBuffer sb1 = (StringBuffer) obj;
	    
		System.out.println(obj.hashCode());
		System.out.println(sb1.hashCode());
		
		
		String s = new String("Yuviii");
//		StringBuffer sb2 = (StringBuffer) s;
//	    ↪> Cannot cast from String to StringBuffer because No relationship between these classes.
		
		System.out.println(s.hashCode());
	}

}
