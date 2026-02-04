package com.Google.regular_expression;

import java.io.File;
import java.util.regex.Pattern;

public class Q5DeleteFiles {

	public static void main(String[] args) {

        String directoryPath = "C:\\Users\\pc\\Documents\\RegexExp";
        File folder = new File(directoryPath);

        Pattern pattern = Pattern.compile(".*\\.pdf");

        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();
            System.out.println("Deleting text files:");

            for (File file : files) {

                if (file.isFile() && pattern.matcher(file.getName()).matches()) {

                    if (file.delete()) {
                        System.out.println("Deleted: " + file.getName());
                    } else {
                        System.out.println("Failed to delete: " + file.getName());
                    }
                }
            }

        } else {
            System.out.println("Invalid directory path!!");
        }

	}
}
