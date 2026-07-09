package com.Google.IOpkg;

import java.io.File;
import java.io.IOException;

public class SubFileAndDirectory {

	public static void main(String[] args) {

//File f = new File(String subdir, String name); → path + name
//to create a file or directory present in some other sub-directory

		File f1 = new File("C:\\Users\\pc\\Documents\\ClassPath\\demo", "subdemo");

		f1.exists();

		System.out.println("subdemo existance: " + f1.exists());

		try {
			f1.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

//#################################################################################################\\		
		
//File f = new File(File subdir, String name); → directory object + name
//to create a file or directory present in some other sub-directory

		File dirPath = new File("C:\\Users\\pc\\Documents\\ClassPath\\demo");
		File f2 = new File(dirPath, "demosub");

		f2.exists();
		System.out.println("demosub existance: " + f2.exists());

		try {
			f2.createNewFile();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

	}
}
