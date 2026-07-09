package com.Google.IOpkg;

import java.io.File;
import java.io.IOException;

public class FileExistance {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\pc\\Documents\\ClassPath\\dummy.txt");

		System.out.println("file existance: " + f.exists());

		try {
			f.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		System.out.println("after creating, file existance: " + f.exists());

	}

}
