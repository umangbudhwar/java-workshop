package collections.activity5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activity5 {
    public static void main(String[] args) {
        // Create an ArrayList to store Employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Adding employees to the list
        employeeList.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeList.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeList.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeList.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeList.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Display the initial list of employees
        System.out.println("List of Employees:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Remove an employee by index
        int indexToRemove = 2;  // Index of the employee to remove
        if (indexToRemove >= 0 && indexToRemove < employeeList.size()) {
            employeeList.remove(indexToRemove);
        }

        // Display the updated list after removing by index
        System.out.println("\nList of Employees after Removing by Index:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Remove an employee by object
        Employee employeeToRemove = new Employee(4, "Emily Brown", 48000.0, "Marketing");
        employeeList.remove(employeeToRemove);

        // Display the updated list after removing by object
        System.out.println("\nList of Employees after Removing by Object:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

