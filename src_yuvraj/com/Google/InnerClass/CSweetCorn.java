package com.Google.InnerClass;

public class CSweetCorn extends PSweetCorn {

//	public CSweetCorn() {
//		super.sweety();
//	}
	
	@Override
	public void sweety() {
//		super.sweety();
		System.out.println("Overrided parent class method.");
	}

	public void salty() {
		System.out.println("it is very salty.");
	}
	
	{
		super.sweety();
		this.sweety();
	}

	public static void main(String[] args) {
		
		// case1
//		PSweetCorn psc = new PSweetCorn();
//		psc.sweety();
//		psc.salty();

		// case2
//		CSweetCorn csc = new CSweetCorn();
//		csc.sweety();
//		csc.salty();

		// case3
		PSweetCorn psc1 = new CSweetCorn();
//		psc1.sweety();
//		psc1.salty();

		// case4
//		CSweetCorn csc1 = (CSweetCorn) new PSweetCorn();

	}
}
