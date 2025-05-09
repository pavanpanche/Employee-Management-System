package JavaDemo.EmployeeManagementSystem;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeManager {
    private final List<Employee> employees = new ArrayList<>();

    // Create Employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }

    // Read Employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employees.forEach(System.out::println);
    }

    // Update Employee
    public void updateEmployee(int id, String newName, String newDept, double newSalary) {
        for (Employee emp : employees) {
            if (emp.getId() == id) {
                emp.setName(newName);
                emp.setDepartment(newDept);
                emp.setSalary(newSalary);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        employees.removeIf(emp -> emp.getId() == id);
        System.out.println("Employee deleted if it existed.");
    }

    // Sort Employees by Name
    public void sortByName() {
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("Employees sorted by name.");
    }

    // Sort Employees by Salary
    public void sortBySalary() {
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.println("Employees sorted by salary (highest first).");
    }

    // Filter Employees by Department
    public void filterByDepartment(String dept) {
        employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(dept))
                .forEach(System.out::println);
    }

    // Filter Employees by Salary Range
    public void filterBySalaryRange(double min, double max) {
        employees.stream()
                .filter(emp -> emp.getSalary() >= min && emp.getSalary() <= max)
                .forEach(System.out::println);
    }
}
