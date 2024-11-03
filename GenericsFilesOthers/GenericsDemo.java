package GenericsFilesOthers;

import java.util.ArrayList;
import java.util.List;

/**
 * Purpose: Explain the use of generics for type safety.
 * Topics: Generic classes, methods, and collections with examples.
 */
public class GenericsDemo {

    // Generic class example
    static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    // Generic method example
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 1. Using Generic Class
        System.out.println("Generic Class Example:");
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println("Item in stringBox: " + stringBox.getItem());

        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(123);
        System.out.println("Item in integerBox: " + integerBox.getItem());

        // 2. Using Generic Method
        System.out.println("\nGeneric Method Example:");
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "Java", "Generics", "Example" };

        System.out.print("Integer Array: ");
        printArray(intArray); // Prints Integer array

        System.out.print("String Array: ");
        printArray(strArray); // Prints String array

        // 3. Using Generics in Collections
        System.out.println("\nGenerics in Collections Example:");
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("List of fruits:");
        for (String fruit : list) {
            System.out.println(fruit);
        }

        // 4. Using Generics with Bounded Types
        System.out.println("\nBounded Type Generics Example:");
        Box<Number> numberBox = new Box<>();
        numberBox.setItem(45.67); // Can hold any Number type (Integer, Double, etc.)
        System.out.println("Item in numberBox: " + numberBox.getItem());

        // Uncommenting the following line will cause a compile-time error
        // Box<String> stringBoxBounded = new Box<Number>(); // Error: String is not a
        // Number
    }
}
