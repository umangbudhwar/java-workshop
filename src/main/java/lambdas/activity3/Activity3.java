package lambdas.activity3;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Activity3 {
    public static void main(String[] args) {
        Supplier<Integer> randomIntGenerator = () -> {
            Random random = new Random();
            return random.nextInt(100) + 1;
        };

        // Generate and print random integers
        for (int i = 0; i < 5; i++) {
            int randomInt = randomIntGenerator.get();
            System.out.println("Random Integer: " + randomInt);
        }
    }
}
