package JavaDemo.EmployeeManagementSystem;

public class Employee {
    private String name;
    private int id;
    private String department;
    private double salary;

    Employee ( int id, String name, String department, double salary2){
        this.name= name;
        this.id = id;
        this.department = department;
        this.salary = salary2;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", id=" + id + ", department=" + department + ", salary=" + salary
                + "]";
    }


}
