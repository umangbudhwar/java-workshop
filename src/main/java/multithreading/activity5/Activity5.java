package multithreading.activity5;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Activity5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Adventurer adventurer1 = new Adventurer("Adventurer 1");
        Adventurer adventurer2 = new Adventurer("Adventurer 2");

        Future<String> future1 = executor.submit(adventurer1);
        Future<String> future2 = executor.submit(adventurer2);

        System.out.println(future1.get());
        System.out.println(future2.get());

        executor.shutdown();
    }
}
