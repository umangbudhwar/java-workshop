package multithreading.activity2;

public class Traveler extends Thread {
    private static int position = 0;

    @Override
    public void run() {
        System.out.println(getName() + " is starting the journey.");
        // Simulate traveler's journey
        for (int i = 0; i < 5; i++) {
            position += 1;
            System.out.println(getName() + " is at position " + position);
        }
        System.out.println(getName() + " has reached Threadsburg.");
    }
}
