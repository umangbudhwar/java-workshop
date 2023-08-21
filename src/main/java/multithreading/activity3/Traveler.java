package multithreading.activity3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Traveler extends Thread {
    private static int position = 0;
    private static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        System.out.println(getName() + " is starting the journey.");
        // Simulate traveler's journey
        for (int i = 0; i < 5; i++) {
            lock.lock();
            try {
                position += 1;
                System.out.println(getName() + " is at position " + position);
            } finally {
                lock.unlock();
            }
        }
        System.out.println(getName() + " has reached Threadsburg.");
    }
}
