package DataStructures;

import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        // Attempting to add a duplicate element
        boolean isAdded = hashSet.add("Apple");
        System.out.println("Attempt to add 'Apple' again: " + isAdded); // Should be false

        // Display the HashSet
        System.out.println("Current HashSet: " + hashSet);

        // Checking if an element exists
        boolean hasBanana = hashSet.contains("Banana");
        System.out.println("Does the HashSet contain 'Banana'? " + hasBanana);

        // Removing an element
        hashSet.remove("Orange");
        System.out.println("HashSet after removing 'Orange': " + hashSet);

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        // Getting the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());
    }
}