package collections.activity4;

import collections.activity4.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Activity4 {
    public static void main(String[] args) {
        // Create an ArrayList to store Employee objects
        List<Employee> employeeList = new ArrayList<>();

        // Adding employees to the list
        employeeList.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeList.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeList.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeList.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeList.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Sort the list by employee ID using EmployeeComparator
        Collections.sort(employeeList, new EmployeeComparator());

        Employee searchKey = new Employee(3, "", 0.0, "");
        int searchResult = Collections.binarySearch(employeeList, searchKey, new EmployeeComparator());

        if (searchResult >= 0) {
            System.out.println("Employee found: " + employeeList.get(searchResult));
        } else {
            System.out.println("Employee not found.");
        }
    }
}

