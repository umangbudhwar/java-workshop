package streams.activity4;

import java.util.ArrayList;
import java.util.List;

public class Activity4 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            integerList.add(i);
        }

        int sumOfSquares = integerList.parallelStream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);
    }
}
