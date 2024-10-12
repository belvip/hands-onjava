# 👨‍💼 Employee Management System

This is a simple Employee Management System built using Java. It allows users to manage employee information, search for employees, and view employee details based on various criteria.

## ✨ Features

- **➕ Add a New Employee**: Easily add new employees to the system with their name, department, and salary.
- **🏢 View Employees by Department**: Retrieve and display a list of employees belonging to a specific department.
- **💰 Find Highest-Paid Employee**: Identify the employee with the highest salary.
- **📉 Find Lowest-Paid Employee**: Identify the employee with the lowest salary.

## 🛠️ Steps to Build the Application

### Step 1: 🏗️ Initial Setup
1. **📂 Create the Project Directory**:
    - Create a new Java project folder for the Employee Management System.
    - Example:
      ```bash
      mkdir employee-management-system
      cd employee-management-system
      ```

2. **⚙️ Initialize the Project**:
    - Create the `Main.java` file where all the main logic will reside.
    - Set up your Java environment if necessary (install Java if not already installed).

### Step 2: 📋 List of Employees
1. **📋 Create a List to Store Employees**:
    - Define an `ArrayList<Employee>` to hold the list of employee objects.
    - Each employee will have attributes like name, department, and salary.
    - Example:
      ```java
      List<Employee> employees = new ArrayList<>();
      ```

2. **👨‍💻 Create an `Employee` Class**:
    - Define an `Employee` class with fields like `name`, `department`, and `salary`.
    - Example:
      ```java
      public class Employee {
          String name;
          String department;
          double salary;

          public Employee(String name, String department, double salary) {
              this.name = name;
              this.department = department;
              this.salary = salary;
          }

          // Add getters and setters here
      }
      ```

### Step 3: ➕ Adding Employee Information
1. **➕ Add Method for Adding New Employees**:
    - Implement logic to add a new employee to the `employees` list.
    - Example:
      ```java
      public void addEmployee(String name, String department, double salary) {
          employees.add(new Employee(name, department, salary));
      }
      ```

2. **✏️ Update Employee Information**:
    - Write logic to find an employee by their name and update their details.
    - Example:
      ```java
      public void updateEmployee(String name, String newDepartment, double newSalary) {
          for (Employee employee : employees) {
              if (employee.getName().equals(name)) {
                  employee.setDepartment(newDepartment);
                  employee.setSalary(newSalary);
                  break;
              }
          }
      }
      ```

### Step 4: 🏢 Viewing Employees by Department
1. **🔍 Implement View Functionality**:
    - Write a method to view employees by department.
    - Example:
      ```java
      public void viewEmployeesByDepartment(String department) {
          for (Employee employee : employees) {
              if (employee.getDepartment().equalsIgnoreCase(department)) {
                  System.out.println(employee.getName() + " - " + employee.getDepartment() + " - Salary: " + employee.getSalary());
              }
          }
      }
      ```

### Step 5: 💰 Finding Highest and Lowest-Paid Employees
1. **💰 Find Highest-Paid Employee**:
    - Implement logic to find the highest-paid employee.
    - Example:
      ```java
      public Employee findHighestPaidEmployee() {
          Employee highestPaid = employees.get(0);
          for (Employee employee : employees) {
              if (employee.getSalary() > highestPaid.getSalary()) {
                  highestPaid = employee;
              }
          }
          return highestPaid;
      }
      ```

2. **📉 Find Lowest-Paid Employee**:
    - Implement logic to find the lowest-paid employee.
    - Example:
      ```java
      public Employee findLowestPaidEmployee() {
          Employee lowestPaid = employees.get(0);
          for (Employee employee : employees) {
              if (employee.getSalary() < lowestPaid.getSalary()) {
                  lowestPaid = employee;
              }
          }
          return lowestPaid;
      }
      ```

### Step 6: ✅ Final Testing and Running the Application
1. **✅ Test All Functionalities**:
    - Test the features for adding, updating, viewing, and finding employees.
    - Print out results to ensure everything works as expected.

2. **🚀 Run the Application**:
    - Compile and run the Java application using the following commands:
      ```bash
      javac Main.java
      java Main
      ```

### Step 7: 🧑‍💻 Skills Learned
- **💻 Java Programming**: Enhanced understanding of Java syntax, data structures, and object-oriented programming principles.
- **📊 Data Management**: Managed employee data using Java collections like `ArrayList`, `HashMap`, and `TreeSet`.
- **🧠 Algorithms**: Implemented search and update algorithms for managing employee records.
- **🔨 Software Design**: Developed skills in structuring a Java application and implementing core functionalities.
- **🐞 Testing and Debugging**: Gained experience in debugging Java applications and validating functionalities through testing.

## 👨‍💼 Employee Class

The **`Employee` class** is a fundamental component of the Employee Management System. It encapsulates all relevant information about an employee and provides methods to interact with that data. Below is a detailed explanation of its attributes and methods.

### 📋 Attributes

- **`String name`**: Represents the employee's name. This is the primary identifier for each employee in the system.
- **`String department`**: Represents the department to which the employee belongs.
- **`double salary`**: Represents the salary of the employee.

### 🛠️ Methods

- **`public Employee(String name, String department, double salary)`**: Constructor that initializes a new instance of the `Employee` class with the specified name, department, and salary.
- **`public String getName()`**: Returns the name of the employee.
- **`public void setName(String name)`**: Updates the employee's name.
- **`public String getDepartment()`**: Returns the department of the employee.
- **`public void setDepartment(String department)`**: Updates the employee's department.
- **`public double getSalary()`**: Returns the salary of the employee.
- **`public void setSalary(double salary)`**: Updates the employee's salary.
- **`public String toString()`**: Returns a string representation of the employee's information, including their name, department, and salary, for easy display in the application.

### Example Usage

Here’s a brief example of how to create a new `Employee` instance and manage their information:

```java
Employee employee = new Employee("John Doe", "Engineering", 75000);
System.out.println(employee.toString()); // Output: John Doe - Engineering - Salary: 75000.0

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/belvip/EmployeeManagementSystem.git
