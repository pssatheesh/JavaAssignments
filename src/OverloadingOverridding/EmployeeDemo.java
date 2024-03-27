package OverloadingOverridding;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getEmployeeDetails() {
        return "Name: " + name + ", Employee ID: " + employeeId;
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;

    public HourlyEmployee(String name, int employeeId, double hourlyRate) {
        super(name, employeeId);
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Hourly Rate: $" + hourlyRate + "/hour";
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, int employeeId, double salary) {
        super(name, employeeId);
        this.salary = salary;
    }

    @Override
    public String getEmployeeDetails() {
        return super.getEmployeeDetails() + ", Salary: $" + salary + "/year";
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 1001),
                new HourlyEmployee("Alice Smith", 2001, 20),
                new SalariedEmployee("Bob Johnson", 3001, 50000)
        };

        for (Employee employee : employees) {
            System.out.println(employee.getEmployeeDetails());
        }
    }
}

