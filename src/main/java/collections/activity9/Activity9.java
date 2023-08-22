package collections.activity9;

import java.util.HashMap;
import java.util.Map;

public class Activity9 {
    public static void main(String[] args) {
        // Create a HashMap to map Employee objects to their IDs
        Map<Integer, Employee> employeeMapById = new HashMap<>();
        employeeMapById.put(1, new Employee(1, "John Doe", 50000.0, "HR"));
        employeeMapById.put(2, new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeMapById.put(3, new Employee(3, "Michael Johnson", 55000.0, "Finance"));

        // Display the map of employees by ID
        System.out.println("Map of Employees by ID:");
        for (Map.Entry<Integer, Employee> entry : employeeMapById.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Employee: " + entry.getValue());
        }

        // Create a HashMap to map Employee objects to their names
        Map<String, Employee> employeeMapByName = new HashMap<>();
        employeeMapByName.put("John Doe", new Employee(1, "John Doe", 50000.0, "HR"));
        employeeMapByName.put("Jane Smith", new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeMapByName.put("Michael Johnson", new Employee(3, "Michael Johnson", 55000.0, "Finance"));

        // Display the map of employees by name
        System.out.println("\nMap of Employees by Name:");
        for (Map.Entry<String, Employee> entry : employeeMapByName.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Employee: " + entry.getValue());
        }
    }
}
