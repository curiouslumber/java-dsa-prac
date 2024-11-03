package foundations;

/**
 * Purpose: Cover the basics of multithreading.
 * Topics: Threads using Thread class and Runnable interface, synchronization, and basic thread communication.
 */
public class MultithreadingDemo {

    // A simple task that will be executed by multiple threads
    static class SimpleTask implements Runnable {
        private final String taskName;

        public SimpleTask(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            System.out.println(taskName + " is starting.");
            try {
                // Simulate some work with a sleep
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.err.println(taskName + " was interrupted.");
            }
            System.out.println(taskName + " is completed.");
        }
    }

    // A shared resource for demonstrating synchronization
    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        // Creating and starting threads using the Thread class
        System.out.println("Starting threads using Thread class:");
        Thread thread1 = new Thread(new SimpleTask("Task 1"));
        Thread thread2 = new Thread(new SimpleTask("Task 2"));
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted.");
        }

        // Demonstrating synchronization with shared resource
        System.out.println("\nDemonstrating synchronization with a shared resource:");
        Counter counter = new Counter();
        Thread incrementThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        
        Thread incrementThread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        incrementThread1.start();
        incrementThread2.start();

        // Wait for increment threads to finish
        try {
            incrementThread1.join();
            incrementThread2.join();
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted while waiting for increment threads.");
        }

        // Displaying the result of the counter
        System.out.println("Final counter value: " + counter.getCount());
    }
}
