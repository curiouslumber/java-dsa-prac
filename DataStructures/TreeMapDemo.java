package DataStructures;

import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(4, "Four");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");

        System.out.println("TreeMap (sorted by keys): " + treeMap);

        // Accessing a value by key
        String value = treeMap.get(3);
        System.out.println("Value for key '3': " + value);

        // Iterating through the TreeMap
        System.out.println("Iterating through TreeMap:");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
        }

        // Checking if a key exists
        boolean containsKey = treeMap.containsKey(2);
        System.out.println("Does the TreeMap contain key '2'? " + containsKey);

        // Removing a key-value pair
        treeMap.remove(4);
        System.out.println("TreeMap after removing key '4': " + treeMap);

        // Getting the first and last keys
        Integer firstKey = treeMap.firstKey();
        Integer lastKey = treeMap.lastKey();
        System.out.println("First key: " + firstKey);
        System.out.println("Last key: " + lastKey);
    }
}