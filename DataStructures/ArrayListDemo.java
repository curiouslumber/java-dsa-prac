package DataStructures;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        // 1. Create an ArrayList to hold Integer values
        ArrayList<Integer> numbers = new ArrayList<>();

        // 2. Adding elements to the ArrayList
        numbers.add(10); // Adding first element
        numbers.add(20); // Adding second element
        numbers.add(30); // Adding third element
        System.out.println("ArrayList after adding elements: " + numbers);

        // 3. Accessing elements
        System.out.println("First element: " + numbers.get(0)); // Accessing the first element
        System.out.println("Second element: " + numbers.get(1)); // Accessing the second element

        // 4. Iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }

        // 5. Removing an element from the ArrayList
        numbers.remove(1); // Removing the second element
        System.out.println("ArrayList after removing the second element: " + numbers);

        // 6. Modifying an element in the ArrayList
        numbers.set(0, 15); // Changing the first element
        System.out.println("ArrayList after modifying the first element: " + numbers);

        // 7. Checking the size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());
    }
}