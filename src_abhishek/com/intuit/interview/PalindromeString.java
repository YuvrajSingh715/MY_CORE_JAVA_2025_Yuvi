package com.intuit.interview;

public class PalindromeString {
    public static void main(String[] args) {
        
        int num = 12321;
        String str = String.valueOf(num);     // convert number to String
        String rev = new StringBuilder(str).reverse().toString(); // reverse String
        
        if (str.equals(rev)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is NOT a Palindrome");
        }
    }
}

