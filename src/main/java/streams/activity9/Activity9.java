package streams.activity9;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Activity9 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Alice", 100.0, LocalDate.of(2023, 8, 1)),
                new Transaction("Bob", 150.0, LocalDate.of(2023, 8, 3)),
                new Transaction("Alice", 200.0, LocalDate.of(2023, 8, 2)),
                new Transaction("David", 75.0, LocalDate.of(2023, 8, 5)),
                new Transaction("Bob", 120.0, LocalDate.of(2023, 8, 4))
        );

        LocalDate specificDate = LocalDate.of(2023, 8, 2);

        double averageAmount = transactions.stream()
                .filter(transaction -> transaction.getPurchaseDate().isAfter(specificDate))
                .collect(Collectors.groupingBy(
                        Transaction::getBuyerName,
                        Collectors.averagingDouble(Transaction::getProductPrice)))
                .values()
                .stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        System.out.println("Average purchase amount after " + specificDate + ": " + averageAmount);
    }
}
