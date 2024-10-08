// Class to represent an employee
class Employee {
    private String name;        // Employee's name
    private String department;  // Employee's department
    private double salary;      // Employee's salary

    // Constructor to initialize employee details
    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters for employee details
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}
