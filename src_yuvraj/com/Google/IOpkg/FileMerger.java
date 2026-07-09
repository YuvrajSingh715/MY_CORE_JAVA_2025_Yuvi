package com.Google.IOpkg;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class FileMerger {
	
	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter("C:\\Users\\pc\\Documents\\ClassPath\\dummy1&2");
		BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\pc\\Documents\\ClassPath\\dummy01"));
		
		String line1 = br1.readLine();
		while(line1 != null) {
			pw.println(line1);
			line1 = br1.readLine();
		}
		
		BufferedReader br2 = new BufferedReader(new FileReader("C:\\Users\\pc\\Documents\\ClassPath\\dummy02"));
		String line2 = br2.readLine();
		while(line2 != null) {
			pw.println(line2);
			line2 = br2.readLine();
		}
		
		pw.flush();
		br1.close();
		br2.close();
		pw.close();

	}

}
