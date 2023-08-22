package streams.activity1;

import java.util.ArrayList;
import java.util.List;

public class Activity1 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        integerList.stream()
                .forEach(element -> System.out.println(element));
    }
}
