package com.intuit.interview;

import java.util.*;

public class VowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        int N = sc.nextInt();
        
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();
        
        for (char ch : str.toCharArray()) {
            if (vowels.indexOf(ch) != -1) { // vowel found
                result.append(ch);
            }
        }
        
        if (result.length() == 0) {
            System.out.println("Not enough vowels");
        } else if (result.length() < N) {
            System.out.println(result.toString());
        } else {
            System.out.println(result.substring(0, N));
        }
    }
}

/*
 * Write a program that accepts a string str1 as input and prints a string that
 * is formed by using the first N vowels of the given string as output and if
 * there is no vowel present in the given string print a message
 * "Not enough vowels". If the string doesn't have N vowels then print all the
 * vowels present in the str1.
 * 
 * 
 * Constraints: N should be always less than the length of str1.
 * 
 * Input format: The first line of input should consist of a string, str1, a
 * given string. The second line of input should consist of an integer N, the
 * number of vowels it should print.
 * 
 * Output format: The single line of output prints a string that is formed by
 * using the first N vowels of the given string. Also, if there is no vowel
 * present in the given string print a message "Not enough vowels".
 * 
 * Sample Input1: demotest 3
 * 
 * Sample Output1: eoe
 * 
 * Explanations1: Here in the given string "demotest", the first N i.e., 3
 * vowels are 'e', 'o', and 'e'. So, it will print "eoe" as output.
 * 
 * Sample Input2: qwrty 2
 * 
 * Sample Output2: Not enough vowels
 * 
 * Explanations2: Since there is no vowel present in the given string. So, it
 * will print "Not enough vowels" as output.
 */
