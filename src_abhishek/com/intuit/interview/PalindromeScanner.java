package com.intuit.interview;

import java.util.Scanner;

public class PalindromeScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // user enters number
        
        int original = number; 
        int reverse = 0;
        
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        
        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
        }
        
        sc.close();
    }
}
