package collections.activity7;



import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Activity7 {
    public static void main(String[] args) {
        // Create a TreeSet of Employee objects sorted by name (natural ordering)
        Set<Employee> employeeSortedSetByName = new TreeSet<>();
        employeeSortedSetByName.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeSortedSetByName.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeSortedSetByName.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeSortedSetByName.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeSortedSetByName.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Display the sorted set by name
        System.out.println("Sorted Set of Employees by Name:");
        for (Employee employee : employeeSortedSetByName) {
            System.out.println(employee);
        }

        // Create a TreeSet of Employee objects sorted by salary using custom comparator
        Set<Employee> employeeSortedSetBySalary = new TreeSet<>(new EmployeeComparator());
        employeeSortedSetBySalary.add(new Employee(1, "John Doe", 50000.0, "HR"));
        employeeSortedSetBySalary.add(new Employee(2, "Jane Smith", 60000.0, "IT"));
        employeeSortedSetBySalary.add(new Employee(3, "Michael Johnson", 55000.0, "Finance"));
        employeeSortedSetBySalary.add(new Employee(4, "Emily Brown", 48000.0, "Marketing"));
        employeeSortedSetBySalary.add(new Employee(5, "David Lee", 70000.0, "IT"));

        // Display the sorted set by salary
        System.out.println("\nSorted Set of Employees by Salary:");
        for (Employee employee : employeeSortedSetBySalary) {
            System.out.println(employee);
        }
    }
}

