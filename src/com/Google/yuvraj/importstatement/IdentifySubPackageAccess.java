package com.Google.yuvraj.importstatement;

//import java.util.regex.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifySubPackageAccess {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("yuvi#123");

		Matcher matcher = pattern.matcher("yuvi#123");

		boolean matchFound = matcher.find();

		System.out.println(pattern);
		System.out.println(matcher);
		System.out.println(matchFound);

	}

}
