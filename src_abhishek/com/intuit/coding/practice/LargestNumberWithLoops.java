package com.intuit.coding.practice;

public class LargestNumberWithLoops {
    
    public static String largestNumberWithLoops(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        // Bubble-like sorting using custom rule
        for (int i = 0; i < s.length; i++) {
            for (int j = i + 1; j < s.length; j++) {

                // Concatenate in both orders
                String ab = s[i] + s[j];
                String ba = s[j] + s[i];

                // If "ba" is bigger, swap them
                if (ba.compareTo(ab) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }

        // If the highest number is "0", answer is "0"
        if (s[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 30, 34, 5, 9};
        System.out.println(largestNumberWithLoops(nums1)); // Output: 9534330

        int[] nums2 = {10, 2};
        System.out.println(largestNumberWithLoops(nums2)); // Output: 210
    }
}



