package com.Google.Mock_interview;

public class Student1_Test {

	public static void main(String[] args) {

		Student1 s1 = new Student1();

		s1.rollNumber = 93489240;
		//s1.studentName = "Yuvraj Singh";

		//s1.setRollNumber(894349584);
		s1.setStudentName("Yuvraj Kushwah");

		System.out.println("Roll number = " + s1.getRollNumber());
		System.out.println("Student name = " + s1.getStudentName());

	}

}
