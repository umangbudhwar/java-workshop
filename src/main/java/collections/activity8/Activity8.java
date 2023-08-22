package collections.activity8;

import java.util.HashSet;
import java.util.Set;

public class Activity8 {
    public static void main(String[] args) {
        // Create the first set of employees
        Set<Employee> set1 = new HashSet<>();
        set1.add(new Employee(1, "John Doe", 50000.0, "HR"));
        set1.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        set1.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));

        // Create the second set of employees
        Set<Employee> set2 = new HashSet<>();
        set2.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        set2.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));

        // Union: Add all elements from set2 to set1
        Set<Employee> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);

        // Display the union set
        System.out.println("Union Set of Employees:");
        for (Employee employee : unionSet) {
            System.out.println(employee);
        }

        // Intersection: Retain only elements that are common in both sets
        Set<Employee> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);

        // Display the intersection set
        System.out.println("\nIntersection Set of Employees:");
        for (Employee employee : intersectionSet) {
            System.out.println(employee);
        }

        // Difference: Remove all elements from set1 that are also in set2
        Set<Employee> differenceSet = new HashSet<>(set1);
        differenceSet.removeAll(set2);

        // Display the difference set
        System.out.println("\nDifference Set of Employees:");
        for (Employee employee : differenceSet) {
            System.out.println(employee);
        }
    }
}
