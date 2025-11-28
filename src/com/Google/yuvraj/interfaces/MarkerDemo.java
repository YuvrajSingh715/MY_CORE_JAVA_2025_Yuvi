package com.Google.yuvraj.interfaces;

public class MarkerDemo {

	public static void main(String[] args) {

		Student student = new Student("Yuviii", 18);

		if (student instanceof MyMarker) {
			System.out.println("This class is marked using MyMarker!");
		} else {
			System.out.println("Not marked by the maker interface");
		}
	
	}
	
}
