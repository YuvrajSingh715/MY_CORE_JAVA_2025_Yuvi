package com.Google.IOpkg;

import java.io.File;

public class DirectoryExistance {

	public static void main(String[] args) {

		File f = new File("C:\\Users\\pc\\Documents\\ClassPath\\demo\\");

		System.out.println("check the directory: " + f.exists());

		f.mkdir();

		System.out.println("after create a directory: " + f.exists());

	}

}
