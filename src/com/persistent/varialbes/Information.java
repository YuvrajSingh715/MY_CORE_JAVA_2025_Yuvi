package com.persistent.varialbes;

public class Information {
	
	static String Schoolname = "Govt.boys higher secondary school";
	static int Classnumber = 11;
	static String Principalname = "Mr.Manmohan Tiyagi";

	int Rollnumber = 241191621;
	String Name = "Yuvraj Singh";
    int Seatnumber = 21;
	
	public static void main(String[]args) {
	  
		Information S1=new Information();
		Information S2=new Information();

		System.out.println("<--- Yuvraj's Exam Time-table --->");
		System.out.println("School Name    : " + S1.Schoolname);
		System.out.println("Principal Name : " + S1.Principalname);
		System.out.println("Class          : " + S1.Classnumber);
		System.out.println("Roll Number    : " + S1.Rollnumber);
		System.out.println("Name           : " + S1.Name);
		System.out.println("Seat Number    : " + S1.Seatnumber);

	    
	    S2.Name="Rohit Sen";
	    S2.Rollnumber = 241191636;
	    S2.Seatnumber = 34;
	    
	    System.out.println("\n<--- Rohit's Exam Time-table --->");	   
	    System.out.println("School Name    : " + S2.Schoolname);
		System.out.println("Principal Name : " + S2.Principalname);
		System.out.println("Class          : " + S2.Classnumber);
		System.out.println("Roll Number    : " + S2.Rollnumber);
		System.out.println("Name           : " + S2.Name);
		System.out.println("Seat Number    : " + S2.Seatnumber);
		
	
	}
}
