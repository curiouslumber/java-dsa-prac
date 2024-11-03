package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsDemo {

    public static void main(String[] args) {
        // Sample data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Demonstrating Stream operations
        System.out.println("Original List: " + numbers);

        // 2. Filtering even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // Filter operation
                .toList();

        System.out.println("Filtered Even Numbers: " + evenNumbers);

        // 3. Mapping to square the numbers
        List<Integer> squaredNumbers = numbers.stream()
                .map(num -> num * num) // Map operation
                .toList();

        System.out.println("Squared Numbers: " + squaredNumbers);

        // 4. Reducing to find the sum of the numbers
        Optional<Integer> sum = numbers.stream()
                .reduce(Integer::sum); // Reduce operation

        sum.ifPresent(s -> System.out.println("Sum of Numbers: " + s));

        // 5. Parallel Streams for performance improvement
        List<Integer> largeNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,
                20);

        // Using parallel stream to sum large numbers
        Optional<Integer> parallelSum = largeNumbers.parallelStream()
                .reduce(Integer::sum); // Parallel reduce operation

        parallelSum.ifPresent(ps -> System.out.println("Parallel Sum of Large Numbers: " + ps));

        // 6. Example of chaining operations
        System.out.println("Chained Operations: ");
        List<Integer> result = numbers.stream()
                .filter(num -> num % 2 != 0) // Filter odd numbers
                .map(num -> num * 10) // Map to multiply by 10
                .sorted() // Sort the resulting numbers
                .toList();

        System.out.println("Chained Result (Odd Numbers * 10): " + result);
    }
}
