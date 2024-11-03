package Multithreading;

import java.util.concurrent.*;

public class ConcurrencyUtilitiesDemo {

    public static void main(String[] args) {
        // Demonstrating ExecutorService and Future
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Submitting tasks to the executor service
        Future<Integer> futureResult1 = executorService.submit(() -> {
            Thread.sleep(1000); // Simulate some work
            return 42; // Return result after work
        });

        Future<Integer> futureResult2 = executorService.submit(() -> {
            Thread.sleep(2000); // Simulate some work
            return 24; // Return result after work
        });

        try {
            // Getting results from the futures
            Integer result1 = futureResult1.get(); // This will wait until the result is available
            Integer result2 = futureResult2.get(); // This will also wait

            System.out.println("Future Result 1: " + result1);
            System.out.println("Future Result 2: " + result2);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown(); // Always remember to shutdown the executor
        }

        // Demonstrating CompletableFuture
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            // Simulating a long computation
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 50;
        });

        // Adding a callback using thenApply
        completableFuture.thenApply(result -> {
            System.out.println("CompletableFuture Result: " + result);
            return result * 2; // Process result
        }).thenAccept(finalResult -> {
            System.out.println("Final Result after processing: " + finalResult);
        });

        // Example of thread-safe collection
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Key1", 1);
        concurrentMap.put("Key2", 2);

        concurrentMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
    }
}