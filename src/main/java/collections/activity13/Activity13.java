package collections.activity13;

import java.util.HashMap;
import java.util.Map;

public class Activity13 {
    public static void main(String[] args) {
        // Create a Map of Employee objects
        Map<Integer, Employee> employeeMapById = new HashMap<>();
        employeeMapById.put(2, new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeMapById.put(1, new Employee(1, "John Doe", 50000.0, "HR"));
        employeeMapById.put(3, new Employee(3, "Michael Johnson", 55000.0, "Finance"));

        // Display the original map
        System.out.println("Original Map of Employees");
        for (Map.Entry<Integer, Employee> entry : employeeMapById.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
        }

        // Remove by Key
        employeeMapById.remove(2);

        // Display the updated map
        System.out.println("\nUpdated Map of Employees");
        for (Map.Entry<Integer, Employee> entry : employeeMapById.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
        }
    }
}
