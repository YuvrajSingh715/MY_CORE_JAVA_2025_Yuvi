package com.Google.yuvraj.interfaces;

public class Adaptor implements Adapts {
	
	public void m1() {System.out.println("yuvi");}
	public void m2() {}
	public void m3() {System.out.println("jyoti");}
	public void m4() {}
	public void m5() {System.out.println("laddu");}

	public static void main(String [] yuuraj) {
		
		AdaptorTest adptor = new AdaptorTest();
		Adaptor adaptor = new Adaptor();
		adaptor.m1();
		adaptor.m3();
		adaptor.m5();
		adptor.m1();
		adptor.m2();
		adptor.m3();
		adptor.m4();
		adptor.m5();
		
	}
}
