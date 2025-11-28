package com.Google.yuvraj.flow.control.selection.Stat;

public class GradeOfStudentDemo {

	public static void main(String[] args) {

		int hin = 75;
		int eng = 75;
		int math = 75;
		int phy = 75;
		int chem = 75;

		int total = (hin + eng + math + phy + chem);
		double persent = total / 5;
		char grade;
		
		if (persent >= 85) {
			grade = 'A';
		}else if (persent >= 75) {
			grade ='B';
		}else if (persent >= 65) {
			grade = 'C';
		}else if (persent >= 55) {
			grade = 'D';
		}else if (persent >= 45) {
			grade = 'E';
		}else {
			grade = 'F';
		}
		
		System.out.println("The Grade of student = " + grade);
	}

}
