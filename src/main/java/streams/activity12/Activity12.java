package streams.activity12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Activity12 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Alice", Arrays.asList(new Address("123 Main St", "City A"))),
                new Person("Bob", Arrays.asList(new Address("456 Elm St", "City B"), new Address("789 Oak St", "City C"))),
                new Person("Eve", Arrays.asList(new Address("555 Pine St", "City D")))
        );

        List<Address> flattenedAddresses = people.stream()
                .flatMap(person -> person.getAddresses().stream())
                .collect(Collectors.toList());

        System.out.println("Flattened Addresses: " + flattenedAddresses);
    }
}
