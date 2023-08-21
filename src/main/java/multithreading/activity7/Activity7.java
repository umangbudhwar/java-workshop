package multithreading.activity7;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Activity7 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            Adventurer adventurer = new Adventurer("Adventurer 1");
            return adventurer.call();
        }, executor);

        CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            Adventurer adventurer = new Adventurer("Adventurer 2");
            return adventurer.call();
        }, executor);

        CompletableFuture<String> combinedCompletableFuture = completableFuture1.thenCombine(completableFuture2, (result1, result2) -> {
            // Combine results from adventurers
            return result1 + " " + result2;
        });

        System.out.println(combinedCompletableFuture.get());

        executor.shutdown();
    }
}
