package com.abhi.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test12 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList(
                "adam", "alex", "alex", "andrew",
                "chris", "denis", "denis", "emma"
        ));

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                list.remove(i);
                i--; // adjust index
            }
        }

        System.out.println(list);
    }
}



