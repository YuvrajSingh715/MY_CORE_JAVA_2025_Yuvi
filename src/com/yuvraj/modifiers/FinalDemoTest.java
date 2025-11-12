package com.yuvraj.modifiers;

public class FinalDemoTest extends FinalDemo {

//	@Override
	public void property() {
		System.out.println("Car , Bike , Money");
	}
	
//	@Override   // this method can't be override because this method is final inside the parents class
//	public void marry() {
//		System.out.println("boys");
//	} 

	public static void main(String[] args) {

		FinalDemoTest fdt = new FinalDemoTest();
		FinalDemo fd = new FinalDemo();
		FinalDemo ft = new FinalDemoTest();

		fdt.property();
		fd.property();
		ft.property();
		fd.marry();
		
	}
	
}
