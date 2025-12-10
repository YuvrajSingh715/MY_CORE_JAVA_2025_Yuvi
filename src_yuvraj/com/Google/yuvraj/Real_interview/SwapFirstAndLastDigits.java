package com.Google.yuvraj.Real_interview;

public class SwapFirstAndLastDigits {
    public static void main(String[] args) {
        int num = ***REMOVED***;

        String s = String.valueOf(num);

        char first = s.charAt(0);
        char last  = s.charAt(s.length() - 1);

        String mid = s.substring(1, s.length() - 1);

        String result = "" + last + mid + first;

        System.out.println("Swap Digits = "+result);
    }
}
