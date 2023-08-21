package multithreading.activity3;

public class Activity3 {
    public static void main(String[] args) {
        Traveler traveler1 = new Traveler();
        Traveler traveler2 = new Traveler();

        traveler1.start();
        traveler2.start();
    }
}
