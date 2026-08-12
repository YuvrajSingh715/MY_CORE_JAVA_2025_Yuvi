package com.intuit.loop;

public class LabeledLoop {

    public static void main(String[] args) {

        outer:   // ✅ label attached to loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break outer;   // ✅ breaks outer loop
                }

                System.out.println(i + " " + j);
            }
        }
    }
}