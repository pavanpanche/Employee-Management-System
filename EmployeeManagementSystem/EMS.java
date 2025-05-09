package JavaDemo.EmployeeManagementSystem;

import java.util.Scanner;

public class EMS {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner scanner = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Sort by Name");
            System.out.println("6. Sort by Salary");
            System.out.println("7. Filter by Department");
            System.out.println("8. Filter by Salary Range");
            System.out.println("9. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(new Employee(id, name, department, salary));
                    break;
                case 2:
                    manager.displayEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter New Department: ");
                    String newDept = scanner.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary = scanner.nextDouble();
                    manager.updateEmployee(updateId, newName, newDept, newSalary);
                    break;
                case 4:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = scanner.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;
                case 5:
                    manager.sortByName();
                    manager.displayEmployees();
                    break;
                case 6:
                    manager.sortBySalary();
                    manager.displayEmployees();
                    break;
                case 7:
                    System.out.print("Enter Department to filter: ");
                    String deptFilter = scanner.nextLine();
                    manager.filterByDepartment(deptFilter);
                    break;
                case 8:
                    System.out.print("Enter Min Salary: ");
                    double minSalary = scanner.nextDouble();
                    System.out.print("Enter Max Salary: ");
                    double maxSalary = scanner.nextDouble();
                    manager.filterBySalaryRange(minSalary, maxSalary);
                    break;
                case 9:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

}
