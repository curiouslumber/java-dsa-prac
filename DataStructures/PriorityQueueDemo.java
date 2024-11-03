package DataStructures;

import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        // Create a priority queue with natural ordering
        PriorityQueue<Integer> naturalOrderQueue = new PriorityQueue<>();

        // Adding elements to the priority queue
        naturalOrderQueue.offer(5);
        naturalOrderQueue.offer(1);
        naturalOrderQueue.offer(3);
        naturalOrderQueue.offer(2);
        naturalOrderQueue.offer(4);

        System.out.println("Priority Queue with natural ordering: " + naturalOrderQueue);

        // Polling elements from the queue
        while (!naturalOrderQueue.isEmpty()) {
            System.out.println("Polled element: " + naturalOrderQueue.poll());
        }

        // Create a priority queue with a custom comparator for reverse order
        PriorityQueue<String> customOrderQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements to the custom priority queue
        customOrderQueue.offer("Apple");
        customOrderQueue.offer("Orange");
        customOrderQueue.offer("Banana");
        customOrderQueue.offer("Grape");
        customOrderQueue.offer("Mango");

        System.out.println("Priority Queue with custom ordering (reverse): " + customOrderQueue);

        // Polling elements from the queue
        while (!customOrderQueue.isEmpty()) {
            System.out.println("Polled element: " + customOrderQueue.poll());
        }
    }
}
