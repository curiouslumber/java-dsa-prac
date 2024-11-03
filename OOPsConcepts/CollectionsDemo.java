package OOPsConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList; // Using LinkedList as a Queue implementation
import java.util.Iterator;

/**
 * Purpose: Introduce Java’s Collection framework.
 * Topics: ArrayList, LinkedList, HashMap, HashSet, Queue, and basic iteration techniques.
 */
@SuppressWarnings("unused")
public class CollectionsDemo {
    public static void main(String[] args) {
        // 1. ArrayList Example
        System.out.println("ArrayList Example:");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("ArrayList: " + arrayList);

        // Iterating through ArrayList
        System.out.println("Iterating through ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // 2. LinkedList Example
        System.out.println("\nLinkedList Example:");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("LinkedList: " + linkedList);

        // Iterating through LinkedList using Iterator
        System.out.println("Iterating through LinkedList with Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // 3. HashMap Example
        System.out.println("\nHashMap Example:");
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 22);
        System.out.println("HashMap: " + hashMap);

        // Accessing a value in HashMap
        System.out.println("Age of Alice: " + hashMap.get("Alice"));

        // 4. HashSet Example
        System.out.println("\nHashSet Example:");
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Red");
        hashSet.add("Blue");
        hashSet.add("Green");
        hashSet.add("Red"); // Duplicate value, will not be added
        System.out.println("HashSet: " + hashSet);

        // 5. Queue Example
        System.out.println("\nQueue Example:");
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);

        // Accessing and removing elements from the Queue
        System.out.println("Polling from Queue: " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}