package com.Google.IOpkg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	
	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("C:\\Users\\pc\\Documents\\ClassPath\\dummy02");
		PrintWriter pw = new PrintWriter(fw);
		
		pw.write(100);
		pw.print(100);
		pw.print(false);
		pw.print('y');
		pw.print("diago");
		pw.flush();
		pw.close();
		
	}

}
