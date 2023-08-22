package collections.activity11;

import java.util.TreeMap;

public class Activity11 {
    public static void main(String[] args) {
        // Create a TreeMap of Employee objects sorted by ID (natural ordering)
        TreeMap<Employee, Double> employeeMapById = new TreeMap<>();
        employeeMapById.put(new Employee(2, "Jane Smith", 60000.0, "IT"), 60000.0);
        employeeMapById.put(new Employee(1, "John Doe", 50000.0, "HR"), 50000.0);
        employeeMapById.put(new Employee(3, "Michael Johnson", 55000.0, "Finance"), 55000.0);

        // Search for an employee by ID
        int searchId = 2;
        Employee foundById = null;
        for (Employee employee : employeeMapById.keySet()) {
            if (employee.getId() == searchId) {
                foundById = employee;
                break;
            }
        }

        if (foundById != null) {
            System.out.println("Employee found by ID: " + foundById);
        } else {
            System.out.println("Employee not found by ID.");
        }

        // Search for an employee by name
        String searchName = "John Doe";
        Employee foundByName = null;
        for (Employee employee : employeeMapById.keySet()) {
            if (employee.getName().equals(searchName)) {
                foundByName = employee;
                break;
            }
        }

        if (foundByName != null) {
            System.out.println("Employee found by Name: " + foundByName);
        } else {
            System.out.println("Employee not found by Name.");
        }
    }
}
