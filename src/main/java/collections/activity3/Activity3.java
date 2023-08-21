package collections.activity3;

import collections.activity3.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activity3 {
    public static void main(String[] args) {
        // Create an ArrayList to store Employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Adding employees to the list
        employeeList.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeList.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeList.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeList.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeList.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Sorting the list of employees by name
        Collections.sort(employeeList);

        // Displaying the sorted list of employees
        System.out.println("List of Employees (Sorted by Name):");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

