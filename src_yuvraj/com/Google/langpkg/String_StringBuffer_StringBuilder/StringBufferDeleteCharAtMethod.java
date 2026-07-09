package com.Google.langpkg.String_StringBuffer_StringBuilder;

public class StringBufferDeleteCharAtMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("SirDdavos");

		sb.deleteCharAt(4);

		System.out.println("after deleting 4th index: " + sb);
		
	}

}

//to delete the character locating at specified index;