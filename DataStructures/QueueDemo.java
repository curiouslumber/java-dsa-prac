package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        // Create a Queue
        Queue<String> queue = new LinkedList<>();

        // Enqueue elements into the queue
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue after enqueuing elements: " + queue);

        // Peek at the front element
        String frontElement = queue.peek();
        System.out.println("Front element (peek): " + frontElement);

        // Dequeue an element from the queue
        String dequeuedElement = queue.poll();
        System.out.println("Dequeued element: " + dequeuedElement);
        System.out.println("Queue after dequeuing an element: " + queue);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Displaying the current size of the queue
        System.out.println("Current queue size: " + queue.size());

        // Dequeue all elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeuing: " + queue.poll());
        }
        System.out.println("Queue after dequeuing all elements: " + queue);
    }
}