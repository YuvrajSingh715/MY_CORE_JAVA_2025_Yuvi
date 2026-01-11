package com.intuit.interview;
public class PalindromeNumber {
    public static void main(String[] args) {
        
        int number = 121;  // step1: store a number
        int original = number;  // step2: keep original number safe
        int reverse = 0;  // step3: create a variable to store reverse result
        
        // step4: reverse logic using while loop
        while (number != 0) {
            int digit = number % 10;   // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            number = number / 10; // remove last digit from number
        }
        
        // step5: compare original with reverse
        if (original == reverse) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is NOT a Palindrome number");
        }
    }
}
