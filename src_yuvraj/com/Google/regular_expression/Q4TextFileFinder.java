package com.Google.regular_expression;

import java.io.File;
import java.util.regex.Pattern;

//Q.1 Write a code to display all text files present in the given directory.

public class Q4TextFileFinder {

	public static void main(String[] args) {

		String directoryPath = "C:\\Users\\pc\\Documents\\RegexExp";
		File folder = new File(directoryPath);

		Pattern pattern = Pattern.compile(".*\\.txt");

		if (folder.exists() && folder.isDirectory()) {
			String[] files = folder.list();
			System.out.println("Text files in the directory:");

			for (String fileName : files) {
				if (pattern.matcher(fileName).matches()) {
					System.out.println(fileName);
				}
			}
		} else {
			System.out.println("Invalid directory path!!");
		}
	}

}
