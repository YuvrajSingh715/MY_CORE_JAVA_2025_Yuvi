package com.Google.Real_interview;

public class PalindromeDemo {

    public static void main(String[] args) {

        int num = 455;
        int original = num;   // store original number
        int rev = 0;
        int rem;

        for (;num > 0; num = num/10) {
            rem = num % 10;
            rev = rev * 10 + rem;
        }
        
//        while (num > 0) {
//            rem = num % 10;
//            rev = rev * 10 + rem;
//            num = num / 10;
//        }

        if (rev == original) {
            System.out.println("This number is Palindrome");
        } else {
            System.out.println("This number is not Palindrome");
        }
    }
}
