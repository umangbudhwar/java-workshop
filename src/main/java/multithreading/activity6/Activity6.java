package multithreading.activity6;

import java.util.concurrent.*;

public class Activity6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Adventurer 1 is starting the journey.");
            // Simulate adventurer's journey
            return "Adventurer 1 has reached Threadsburg.";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("Adventurer 2 is starting the journey.");
            // Simulate adventurer's journey
            return "Adventurer 2 has reached Threadsburg.";
        });

        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            return result1 + " " + result2;
        });

        System.out.println(combinedFuture.get());
    }
}
