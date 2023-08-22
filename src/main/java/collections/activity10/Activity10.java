package collections.activity10;

import java.util.Map;
import java.util.TreeMap;

public class Activity10 {
    public static void main(String[] args) {
        // Create a TreeMap of Employee objects sorted by ID (natural ordering)
        TreeMap<Employee, Double> employeeMapById = new TreeMap<>();
        employeeMapById.put(new Employee(2, "Jane Smith", 60000.0, "IT"), 60000.0);
        employeeMapById.put(new Employee(1, "John Doe", 50000.0, "HR"), 50000.0);
        employeeMapById.put(new Employee(3, "Michael Johnson", 55000.0, "Finance"), 55000.0);


        // Display the sorted map by ID (natural ordering)
        System.out.println("Sorted Map of Employees by ID (Natural Ordering):");
        for (Map.Entry<Employee, Double> entry : employeeMapById.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Salary: " + entry.getValue());
        }

        // Create a TreeMap of Employee objects sorted by salary (custom comparator)
        TreeMap<Employee, Double> employeeMapBySalary = new TreeMap<>(new EmployeeComparator());
        employeeMapBySalary.put(new Employee(1, "John Doe", 50000.0, "HR"), 50000.0);
        employeeMapBySalary.put(new Employee(2, "Jane Smith", 60000.0, "IT"), 60000.0);
        employeeMapBySalary.put(new Employee(3, "Michael Johnson", 55000.0, "Finance"), 55000.0);

        // Display the sorted map by salary (custom comparator)
        System.out.println("\nSorted Map of Employees by Salary (Custom Comparator):");
        for (Map.Entry<Employee, Double> entry : employeeMapBySalary.entrySet()) {
            System.out.println("Employee: " + entry.getKey() + ", Salary: " + entry.getValue());
        }
    }
}
