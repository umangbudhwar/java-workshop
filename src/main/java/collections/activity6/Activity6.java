package collections.activity6;

import collections.activity2.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Activity6 {
    public static void main(String[] args) {
        // Create a HashSet to store unique Employee objects
        Set<Employee> employeeSet = new HashSet<>();

        // Adding employees to the set
        employeeSet.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeSet.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeSet.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeSet.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeSet.add(new Employee(5, "David Lee", 70000.0, "IT"));
        employeeSet.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Displaying the set of employees using a for-each loop
        System.out.println("Set of Employees:");
        for (Employee employee : employeeSet) {
            System.out.println(employee);
        }
    }
}

