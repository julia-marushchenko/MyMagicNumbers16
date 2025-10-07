// Java program to find numbers dividable by 3

package com.numbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Creating HashSet with unic numbers
        Set<Integer> set = new HashSet<>();

        // Adding numbers to set
        for (int index = 0; index < 99; index++) {
            set.add(new Random().nextInt());
        }

        // Checking if numbers are dividable by 3
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {

            // Creating local variable to store integer number
            int number = it.next();

            // Condition
            if ( number % 3 == 0) {

                // Printing result to console
                System.out.println(number + " is dividable by 3.");
            } else {

                // Printing result to console
                System.out.println(number + " is not dividable by 3.");
            }
        }
    }
}