package streams.activity13;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Activity13 {
    public static void main(String[] args) {
        String input = "abracadabra";

        LinkedHashSet<Character> distinctChars = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        String result = distinctChars.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
