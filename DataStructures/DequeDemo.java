package DataStructures;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {
        // Create a Deque using ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front and back of the Deque
        deque.addFirst("First");
        deque.addLast("Second");
        deque.addFirst("Zero");
        deque.addLast("Third");

        // Display the Deque
        System.out.println("Initial Deque: " + deque);

        // Accessing elements
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());

        // Removing elements from the front and back
        String removedFirst = deque.removeFirst();
        String removedLast = deque.removeLast();
        System.out.println("Removed from front: " + removedFirst);
        System.out.println("Removed from back: " + removedLast);

        // Display the Deque after removals
        System.out.println("Deque after removals: " + deque);

        // Iterating through the Deque
        System.out.println("Iterating through the Deque:");
        for (String element : deque) {
            System.out.println(element);
        }
    }
}
