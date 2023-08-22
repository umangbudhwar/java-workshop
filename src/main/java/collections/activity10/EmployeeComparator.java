package collections.activity10;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        // Compare employees by their salary
        return Double.compare(emp1.getSalary(), emp2.getSalary());
    }
}
