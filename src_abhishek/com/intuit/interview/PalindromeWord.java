package com.intuit.interview;

public class PalindromeWord {
    public static void main(String[] args) {
        
        String word = "madam";   // input word
        String reverse = "";     // to store reversed
        
        // reverse logic using for loop
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        
        // compare ignoring case
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a Palindrome Word");
        } else {
            System.out.println(word + " is NOT a Palindrome Word");
        }
    }
}
