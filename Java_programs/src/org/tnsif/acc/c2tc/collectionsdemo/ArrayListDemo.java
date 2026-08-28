package org.tnsif.acc.c2tc.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Dragon");

        System.out.println(fruits);

        // Accessing second element
        System.out.println("Second Fruit: " + fruits.get(1));

        // Updating element
        fruits.set(1, "Cherry");
        System.out.println(fruits);

        // Removing element
        fruits.remove(2);
        System.out.println("After removing " + fruits);

        // Checking whether Mango is present
        if (fruits.contains("Mango")) {
            System.out.println("Requested fruit is present");
        } else {
            System.out.println("Requested fruit is not present");
        }

        // Using Iterable
        Iterable<String> iterableFruits = fruits;

        System.out.println("Traversing using Iterable: " + iterableFruits);

        // Using for-each loop
        for (String fruit : fruits) {
            System.out.println("Traversing using for-each loop: " + fruit);
        }
    }
}