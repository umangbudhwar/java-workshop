package multithreading.activity4;

public class Adventurer implements Runnable {
    private String name;

    public Adventurer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting the journey.");
        // Simulate adventurer's journey
        System.out.println(name + " has reached Threadsburg.");
    }
}