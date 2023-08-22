package streams.activity3;

import java.util.ArrayList;
import java.util.List;

public class Activity3 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        int sum = integerList.stream()
                .reduce(0, (acc, element) -> acc + element);

        System.out.println("Sum of elements: " + sum);
    }
}
