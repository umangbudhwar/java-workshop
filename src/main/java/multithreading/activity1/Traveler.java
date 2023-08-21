package multithreading.activity1;

public class Traveler extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + " is starting the journey.");
        // Simulate traveler's journey
        System.out.println(getName() + " has reached Threadsburg.");
    }
}
