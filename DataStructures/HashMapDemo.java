package DataStructures;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("Apple", 1);
        hashMap.put("Banana", 2);
        hashMap.put("Orange", 3);
        hashMap.put("Mango", 4);

        // Display the HashMap
        System.out.println("Initial HashMap: " + hashMap);

        // Accessing a value using its key
        int appleValue = hashMap.get("Apple");
        System.out.println("Value associated with 'Apple': " + appleValue);

        // Checking if a key exists
        boolean hasBanana = hashMap.containsKey("Banana");
        System.out.println("Does the HashMap contain 'Banana'? " + hasBanana);

        // Updating a value
        hashMap.put("Apple", 10);
        System.out.println("Updated HashMap after changing value of 'Apple': " + hashMap);

        // Removing a key-value pair
        hashMap.remove("Orange");
        System.out.println("HashMap after removing 'Orange': " + hashMap);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting the size of the HashMap
        System.out.println("Size of the HashMap: " + hashMap.size());
    }
}