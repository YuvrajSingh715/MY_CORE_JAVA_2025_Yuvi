package com.intuit.interview;

public class PalindromeWordSB {
    public static void main(String[] args) {
        
        String word = "RaceCar";
        String reverse = new StringBuilder(word).reverse().toString();
        
        if (word.equalsIgnoreCase(reverse)) {
            System.out.println(word + " is a Palindrome Word");
        } else {
            System.out.println(word + " is NOT a Palindrome Word");
        }
    }
}
