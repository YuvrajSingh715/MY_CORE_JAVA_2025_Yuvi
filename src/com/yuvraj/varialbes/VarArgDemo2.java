package com.yuvraj.varialbes;

public class VarArgDemo2 {

	static public void main(String[] args) {
		
		sum();
		
		sum(10,20);
		
		sum(10,20,30);

	}
	
	
	public static void sum(int... x) {    //x[0]=10, x[1]=20
		
		int total=0;
		
		for(int y:x) {
			total = total+y;
		}
		
		System.out.println("The sum : "+total);
		
	}

}
