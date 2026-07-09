package com.Google.IOpkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException{
		
		File f = new File("C:\\Users\\pc\\Documents\\ClassPath\\dummy01");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write(212);
		bw.newLine();
		
		char [] ch = {'z','y','x','w'};
		bw.write(ch);
		bw.newLine();
		bw.write("skyfall");
		bw.newLine();
		bw.write(1234567);
		bw.flush();
		bw.close();
	}
}
