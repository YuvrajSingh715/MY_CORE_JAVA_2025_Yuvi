package com.Google.langpkg.String_StringBuffer_StringBuilder;

public abstract class StringBufferDeleteMethod {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("CatCarDog");

		sb.delete(3, 6);

		System.out.println("After using the delete() method: " + sb);

	}

}
