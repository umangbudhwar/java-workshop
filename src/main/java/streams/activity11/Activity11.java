package streams.activity11;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Activity11 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "act", "cat", "god");

        Map<String, List<String>> anagramGroups = words.stream()
                .collect(Collectors.groupingBy(Activity11::sortChars));

        anagramGroups.values().forEach(group -> System.out.println(group));
    }

    private static String sortChars(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
