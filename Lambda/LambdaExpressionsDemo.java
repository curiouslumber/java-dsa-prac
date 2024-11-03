package Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Purpose: Introduce lambda expressions for functional programming.
 * Topics: Syntax, functional interfaces, and using lambdas with the Collection API.
 */
@SuppressWarnings("unused")
public class LambdaExpressionsDemo {

    public static void main(String[] args) {
        // 1. Using lambda expressions to create a functional interface instance
        System.out.println("Using lambda expressions with functional interfaces:");

        // Functional interface
        interface Greeting {
            void greet(String name);
        }

        // Lambda expression implementing the Greeting interface
        Greeting greeting = name -> System.out.println("Hello, " + name + "!");
        greeting.greet("Alice"); // Output: Hello, Alice!

        // 2. Lambda expressions with the Collection API
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        System.out.println("\nOriginal List:");
        System.out.println(names);

        // 3. Using lambda expressions to sort the list
        Collections.sort(names, (a, b) -> a.compareTo(b)); // Sorting using lambda
        System.out.println("\nSorted List:");
        System.out.println(names);

        // 4. Filtering with lambdas using Predicate functional interface
        System.out.println("\nNames starting with 'A':");
        printFilteredNames(names, name -> name.startsWith("A")); // Filtering using lambda

        // 5. Using lambda expressions with method references
        System.out.println("\nUsing method references:");
        names.forEach(System.out::println); // Method reference to print each name
    }

    // Method to print filtered names based on the predicate
    private static void printFilteredNames(List<String> names, Predicate<String> condition) {
        for (String name : names) {
            if (condition.test(name)) {
                System.out.println(name);
            }
        }
    }
}
