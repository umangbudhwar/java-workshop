package multithreading.activity5;

import java.util.concurrent.Callable;

public class Adventurer implements Callable<String> {
    private String name;

    public Adventurer(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        System.out.println(name + " is starting the journey.");
        // Simulate adventurer's journey
        return name + " has reached Threadsburg.";
    }
}