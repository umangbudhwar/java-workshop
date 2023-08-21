package multithreading.activity4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Activity4 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Adventurer adventurer1 = new Adventurer("Adventurer 1");
        Adventurer adventurer2 = new Adventurer("Adventurer 2");

        executor.execute(adventurer1);
        executor.execute(adventurer2);

        executor.shutdown();
    }
}
