package DataStructures;

public class ArrayDemo {

    public static void main(String[] args) {
        // 1. Initialization of an array
        int[] numbers = { 10, 20, 30, 40, 50 };

        // 2. Accessing elements
        System.out.println("First element: " + numbers[0]); // Accessing the first element
        System.out.println("Last element: " + numbers[numbers.length - 1]); // Accessing the last element

        // 3. Iterating through the array using a for loop
        System.out.println("Iterating through the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // 4. Iterating through the array using an enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println("Element: " + number);
        }

        // 5. Modifying an element in the array
        numbers[2] = 35; // Changing the third element
        System.out.println("After modification, element at index 2: " + numbers[2]);
    }
}