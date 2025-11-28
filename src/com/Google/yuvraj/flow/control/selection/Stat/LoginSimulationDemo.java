package com.Google.yuvraj.flow.control.selection.Stat;

public class LoginSimulationDemo {

	public static void main (String[] args) {
		
		String userName = "yuviii@321";   //yuviii@321
		int password = 32143;             //32143
		
		if (userName.equals("yuviii@321") && password == 32143) {
			System.out.println("Login Successfully 🥳😍" );
			
		}else if (!userName.equals("yuviii@321") && password != 32143) {
			System.out.println("Both Credentials are Invalid (❌)");
			
		}else if (userName.equals("yuviii@321")) {
			System.out.println("userName is valid (✔)  & password is invalid (❌)");
			
		}else {
			System.out.println("userName is invalid (❌) & password is valid (✔)");
		}
		
	}
}
