package DataStructures;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Grape");
        treeSet.add("Mango");

        System.out.println("TreeSet (sorted order): " + treeSet);

        // Attempting to add a duplicate element
        boolean isAdded = treeSet.add("Apple");
        System.out.println("Was 'Apple' added again? " + isAdded);

        // Iterating through the TreeSet
        System.out.println("Iterating through TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Checking for an element
        boolean containsGrape = treeSet.contains("Grape");
        System.out.println("Does the TreeSet contain 'Grape'? " + containsGrape);

        // Removing an element
        treeSet.remove("Orange");
        System.out.println("TreeSet after removing 'Orange': " + treeSet);

        // Getting the first and last elements
        String first = treeSet.first();
        String last = treeSet.last();
        System.out.println("First element: " + first);
        System.out.println("Last element: " + last);
    }
}