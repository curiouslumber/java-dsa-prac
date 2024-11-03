package DataStructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Inserting elements into the LinkedHashMap
        linkedHashMap.put("Apple", 1);
        linkedHashMap.put("Banana", 2);
        linkedHashMap.put("Cherry", 3);
        linkedHashMap.put("Date", 4);

        // Display the LinkedHashMap
        System.out.println("Initial LinkedHashMap: " + linkedHashMap);

        // Accessing elements
        System.out.println("Value for 'Banana': " + linkedHashMap.get("Banana"));

        // Removing an element
        linkedHashMap.remove("Cherry");
        System.out.println("After removing 'Cherry': " + linkedHashMap);

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking if a key exists
        System.out.println("Contains 'Apple': " + linkedHashMap.containsKey("Apple"));
        System.out.println("Contains 'Cherry': " + linkedHashMap.containsKey("Cherry"));
    }
}