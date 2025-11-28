package com.Google.yuvraj.interfaces;

public interface Variable {
	
	void m1 ();  //method is by-default => {public,abstract}
//	public abstract void m1();
	
	int n = 100;  // we can't modifie  the value of interface variable inside the implementation class 
                  //	every interface variable are by-default public, static and final

//	public int n = 100;
//	public static int n = 100;
//	public static final int n = 100;
}
