package streams.activity5;

import java.util.ArrayList;
import java.util.List;

public class Activity5 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grape");
        stringList.add("Cherry");

        String result = stringList.stream()
                .filter(str -> str.startsWith("A"))
                .findFirst()
                .orElse("No string found");

        System.out.println(result);
    }
}
