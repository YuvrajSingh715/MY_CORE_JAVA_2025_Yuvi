package com.Google.IOpkg;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FlushAndCloseMethod {

	public static void main(String[] args) throws Exception {

		FileWriter fw = new FileWriter("C:\\Users\\pc\\Documents\\ClassPath\\demo\\subdemo");
		
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("The story about the king's landing.");
		//Data is still in buffer (may not be written yet)
		
		bw.flush(); // force write to file immediately
		
		System.out.println("Data flushed to file");
		
		bw.close();
		
	}
	
}

//👉 If you call close(), no need to call flush() separately. (because close already flushes);