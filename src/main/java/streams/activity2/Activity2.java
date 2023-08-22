package streams.activity2;

import java.util.ArrayList;
import java.util.List;

public class Activity2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("grape");
        stringList.add("pear");
        stringList.add("orange");

        stringList.stream()
                .filter(str -> str.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
