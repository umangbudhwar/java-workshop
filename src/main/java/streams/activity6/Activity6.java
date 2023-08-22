package streams.activity6;

import java.util.ArrayList;
import java.util.List;

public class Activity6 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("banana");
        stringList.add("apple");
        stringList.add("grape");
        stringList.add("pear");
        stringList.add("orange");

        stringList.stream()
                .sorted((str1, str2) -> Integer.compare(str1.length(), str2.length()))
                .forEach(System.out::println);
    }
}
