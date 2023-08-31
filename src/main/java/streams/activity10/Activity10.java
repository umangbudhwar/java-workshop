package streams.activity10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Activity10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOddMap = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        List<Integer> evenNumbers = evenOddMap.get(true);
        List<Integer> oddNumbers = evenOddMap.get(false);

        double averageEven = evenNumbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        int sumOdd = oddNumbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Average of even numbers: " + averageEven);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }
}
