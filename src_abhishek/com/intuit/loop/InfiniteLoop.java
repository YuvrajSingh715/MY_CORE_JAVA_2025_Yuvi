package com.intuit.loop;

public class InfiniteLoop {

    public static void main(String[] args) {

        int count = 0;

        while (true) {
            System.out.println("Running . . . " + count);
            count++;

            if (count == 5) {
                break;
            }
        }

        System.out.println("Loop Ended");
    }
}