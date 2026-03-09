package com.Google.InnerClass;

//Type-2: Anonymus inner class that implements an interface;

public class A2CSweetCorn {
	
	public static void main(String[] args) {
		
		FInterface fi = new FInterface() {
			
			@Override
			public void sweetCorn() {
				System.out.println("Corn is very Yumm! Yumm..");
				this.spicyCorn();
			}
			
			public void spicyCorn() {
				System.out.println("Corn is very Eww Eww!..");
			}
		};
		
		fi.sweetCorn();
		
	}

}
